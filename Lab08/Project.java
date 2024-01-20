//Author:Moin Khan
// A class to store project details using Date class in it.
import java.time.LocalDate;

public class Project {
    private String projectId;
    private String projectName;
    private String projectDiscription;
    private String projectType;
    private Date projectStartDate;
    private Date estimatedEndDate;
    private Date actualEndDate;
    private boolean isActive;
    private static int projectCounter = 1000;
    // A method to set Project Start date by passing a Date object  as a parameter.
    public void setProjectStartDate(String date)
    {
        Date s1 = new Date(date);
        LocalDate currentdate = LocalDate.now();
        String currentDate = currentdate.toString();
        Date s2 = new Date("2000-01-01");
        if (s1.isBefore(s2))
        {
            this.projectStartDate = new Date(currentDate);
        }
        else
        {
            this.projectStartDate = new Date(date);
        }
    }
    // A method to set Estimated end date by passing a Date object  as a parameter.
    public void setEstimatedEndDate(String date)
    {
        Date s1 = new Date(date);
        Date s2 = new Date(this.projectStartDate);
        if (s2.isBefore(s1))
        {
            this.estimatedEndDate = new Date(s1);
        }
        else
        {
          s2.addDays(30);  
          this.estimatedEndDate = new Date(s2);
        }
    }
    // A method to set Actual end date by passing a Date object  as a parameter.
    public void setActualEndDate(String date)
    {
        if (date != null)
        {
            Date s1 = new Date(date);
            if(this.projectStartDate.isBefore(s1))
            {
                this.actualEndDate = new Date(s1);
            }
            else 
            {
                this.actualEndDate = null;
            }
        }
        else 
        {
            this.actualEndDate = null;
        }
        
    }
    // A method to set project type accoring to the duration of the project in years.
    public void setProjectType()
    {
        Date s1 = new Date(this.projectStartDate);
        Date s2 = new Date(this.estimatedEndDate);
        double numberOfDays = s1.daysBetween(s2);
        double numberOfYears = numberOfDays/365;
        if (numberOfYears <= 1)
        {
            this.projectType = "ST";
        }
        else if (numberOfYears > 1 && numberOfYears <= 3)
        {
            this.projectType = "IM";
        }
        else if (numberOfYears > 3)
        {
            this.projectType = "LT";
        }
    }
    // A method to set project ID according to Project type and Project Counter.
    public void setProjectId()
    {
        if (this.projectType.equalsIgnoreCase("ST"))
        {
            this.projectId = this.projectType + "-" + projectCounter;
            projectCounter++;
        }
        else if (projectType.equalsIgnoreCase("IM"))
        {
            this.projectId = projectType + "-" + projectCounter;
            projectCounter++;
        }
        else if (projectType.equalsIgnoreCase("LT"))
        {
            this.projectId = this.projectType + "-" +  projectCounter;
            projectCounter++;
        }
    }
    // A Method to Deactivate project and passing a date as aparameter to set as Actual End Date.
    public void deactivateProject(String date)
    {
       setActualEndDate(date);
       this.isActive = false;
    }
    // A Method to Activate project and set null as Actual End Date.
    public void activateProject()
    {
        this.setActualEndDate(null);
        this.isActive = true;
    }
    // A Method to push project estimated days back by the number of days passed as parameter.
    public void pushProject(int daysToAdd)
    {
        this.estimatedEndDate.addDays(daysToAdd);
        this.setProjectType();
    }
    // A Method to calculate estimated number of days it will take a project to complete.
    public int estimatedDaysToCompletion()
    {
        int daysbetween = this.projectStartDate.daysBetween(this.estimatedEndDate);
        return daysbetween;
    }
    // A Method to check if two projects have same name and hence are equal according to given guideline.
    public boolean equals(Project s)
    {
        boolean f = false ;
        f = this.projectName.equalsIgnoreCase(s.getProjectName());
        return f;
    }
    // A Constructor to initialize values for Project class object.
    public Project (String projectName, String projectDescription, String projectedStartDate, String projectedEndDate)
    {
        this.projectName = projectName;
        this.projectDiscription = projectDescription;
        this.setProjectStartDate(projectedStartDate);
        this.setEstimatedEndDate(projectedEndDate);
        this.setProjectType();
        this.setProjectId();
        this.setActualEndDate(null);
    }
    // Given below are all the getters for all Private Attributes.
    public String getProjectId()
    {
        return this.projectId;
    } 
    public String getProjectName()
    {
        return this.projectName;
    }
    public String getProjectDescription()
    {
        return this.projectDiscription;
    }
    public String getProjectType()
    {
        return projectId;
    }
    public boolean getIsActive()
    {
        return isActive;
    }
    public Date getProjectStartDate()
    {
        return projectStartDate;
    }
    public Date getEstimatedEndDate()
    {
        return estimatedEndDate;
    }
    public Date getActualEndDate()
    {
        return actualEndDate;
    }
    // A Method that returns a String representation of a Project object.
    public String toString()
    {
        String output = "";
        String part1 = "ID: (" + getProjectId() + ")";
        String part2 = getProjectName();
        String part3 = getProjectDescription();
        String part4 = "Start: " + getProjectStartDate().toString() + " End: " + getEstimatedEndDate().toString();
        if (getActualEndDate() == null)
        {
            output = part1 + "\n" +  part2 + "\n" + part3 + "\n" + part4 ;
        }
        else if (getActualEndDate() != null)
        {
            output = part1 + "\n" +  part2 + "\n" + part3 + "\n" + "COMPLETED: " + getActualEndDate().toString() ;
        }
        return output;
    }
}