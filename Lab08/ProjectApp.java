//Author : Moin Khan
// Program to test all the functionality of Project.class

public class ProjectApp {
    public static void main(String[] args) {
        Project s1 = new Project("Sys-Renew", "Upgrade payroll system and hardware", "2022-5-22",
        "2022-6-21");
        Project s2 = new Project("LAB-IMPLEMENT", "Update Lab Results Reports" , "2023-5-22",
        "2023-9-30");
        Project s3 = new Project("LAB-IMPLEMENT", "Update Lab Results Reports" , "2024-5-22",
        "2024-9-30");
        System.out.println("Project 1:");
        System.out.println(s1.toString());
        System.out.println("Project 2:");
        System.out.println(s2.toString());
        System.out.println("Project 3:");
        System.out.println(s3.toString());
        System.out.println("****PROJECT 1****");
        int estimateddays = s1.estimatedDaysToCompletion();
        System.out.println("Estimated days to completion: " + estimateddays);
        int delay = 5;
        s1.pushProject(delay);
        System.out.println(delay + " days late:");
        System.out.println(s1.toString());
        delay = 50;
        s1.pushProject(delay);
        System.out.println(delay + " days late:");
        System.out.println(s1.toString());
        delay = 389;
        s1.pushProject(delay);
        System.out.println(delay + " days late:");
        System.out.println(s1.toString());
        s1.deactivateProject("2023-10-15");
        System.out.println("Deactivated:");
        System.out.println(s1.toString());
        s1.activateProject();
        System.out.println("Activated:");
        System.out.println(s1.toString());
        //Checking if two projects have same name and hence are equal. 
        boolean f = s1.equals(s2);
        if ( f == true)
        {
            System.out.println("Projects 1 and 2 are equal.");
        }
        else if (f == false)
        {
            System.out.println("Projects 1 and 2 are not equal.");
        }
        boolean f2 = s2.equals(s3);
        if ( f2 == true)
        {
            System.out.println("Projects 2 and 3 are equal.");
        }
        else if (f2 = false)
        {
            System.out.println("Projects 2 and 3 are not equal.");
        }




    }
    
}
