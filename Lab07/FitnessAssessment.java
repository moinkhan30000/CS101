//Author : Moin Khan
// A class with different methods to assess the Fitness
import java.time.LocalDate;
import java.time.Period;

public class FitnessAssessment {
    // All variables set to private
    private LocalDate birthDate;
    private double height;
    private double weight;
    private double restingHeartRate;
    private double waist;
    private double hips;
    private String gender;
    public FitnessAssessment (double height, double weight, double restingHeartRate, double waist, double hips, String gender, String birthDate)
    {
        this.height = height;
        this.weight = weight;
        this.restingHeartRate = restingHeartRate;
        this.waist = waist;
        this.hips = hips;
        this.gender = gender;
        setBirthdate(birthDate);
        
    }
    // Seprate method to set date of birth with condition
    public void setBirthdate(String birthDate)
    {
        LocalDate tempBirthdate;
        LocalDate currentDate = LocalDate.now();
        tempBirthdate = LocalDate.parse(birthDate);
        if (tempBirthdate.isBefore(currentDate))
        {
            this.birthDate = tempBirthdate;
        }
        else 
        {
            this.birthDate = currentDate;
        }
    } 
    // Setters and Getters for all other private variables   
        public LocalDate getBirthdate()
    {
        return this.birthDate;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getHeight ()
    {
        return this.height;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public void setRestingHeartRate(double restingHeartRate)
    {
        this.restingHeartRate = restingHeartRate;
    }
    public double getRestingHeartRate()
    {
        return this.restingHeartRate;
    }
    public void setWaist(double waist)
    {
        this.waist = waist;
    }
    public double getWaist()
    {
        return this.waist;
    }
    public void setHips(double hips)
    {
        this.hips = hips;
    }
    public double getHips()
    {
        return this.hips;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public String getGender()
    {
        return this.gender;
    }
    // Method to calculate current age
    public double currentAge(LocalDate birthDate)
    {
        LocalDate tempBirthdaDate = birthDate;
        Period period = Period.between(tempBirthdaDate, LocalDate.now());
        double age = (double) period.getYears();
        return age;
        
    }
    // Method to calculate Max heart rate using age
    public double calculateMaxHeartRate(double age)
    {
        double maxHeartRate = (220-age);
        return maxHeartRate;
    }
    // Method to calculate Target heart rate using maxheartrate
    public double calculateTargetHeartRate(double  maxHeartRate)
    {
        double targetHeartRate = (0.85*maxHeartRate);
        return targetHeartRate;
    }
    // Method to calculate waist to hip ratio using waist and hip measurement
    public double waistHipRatio(double waist, double hips)
    {
        double waistHipRatio = waist/hips;
        return waistHipRatio;
    }
    // Method to calculate BMI using weight and height measurement
    public double calculateBMI(double weight, double height)
    {
        double BMI = (weight/(height*height));
        return BMI;
    }
    // Method to calculate Category of BMI using BMI
    public String findBMICategory(double BMI)
    {
        String BMICategory = "";
        if (BMI>30)
        {
            BMICategory = "Obese";
        }
        else if(BMI>=25 && BMI<=30)
        {
            BMICategory = "Overweight";
        }
        else if (BMI>=20 && BMI<=25)
        {
            BMICategory = "Normal";
        }
        else if (BMI<20)
        {
            BMICategory = "Underweight";
        }
        return BMICategory;
    }
    //Method to determine category of Fitness
    public String determineFitnessLevel(String gender ,double BMI, double restingHeartRate, double waistHipRatio)
    {
        String fitness = "";
        int fitnesscount = 0 ;
        if (BMI > 20 && BMI < 24)
        {
            fitnesscount++;
        }
        if(restingHeartRate <70)
        {
            fitnesscount++;
        }
        if (waistHipRatio < 1 && gender.compareToIgnoreCase("m") ==0 )
        {
            fitnesscount++;
        }
        if (waistHipRatio < 0.9 && gender.compareToIgnoreCase("f") ==0 )
        {
            fitnesscount++;
        }
        if (fitnesscount == 0)
        {
            fitness = "POOR";
        }
        else if (fitnesscount == 1)
        {
            fitness = "AVERAGE";
        }
        else if (fitnesscount == 2)
        {
            fitness = "GOOD";
        }
        else if(fitnesscount == 3)
        {
            fitness = "EXCELLENT";
        }
        return fitness;


    }

}
