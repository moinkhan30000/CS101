// Author : Moin Khan
// Class date to store and use date in different ways 
import java.util.ArrayList;

public class Date {
    private int day;
    private int month;
    private int year;
    private static ArrayList <Integer> daysInMonth = new ArrayList<Integer>();   
    // Arraylist get set according to the year being leapyear or not.  
    private void initDaysInMonth(int year)
    {
        boolean f = false;
        f = isLeapYear(year);
        daysInMonth.add(0);
        daysInMonth.add(0);
        daysInMonth.add(0);
        daysInMonth.add(0);
        daysInMonth.add(0);
        daysInMonth.add(0);
        daysInMonth.add(0);
        daysInMonth.add(0);
        daysInMonth.add(0);
        daysInMonth.add(0);
        daysInMonth.add(0);
        daysInMonth.add(0);
        if (f == false)
        {
            daysInMonth.set(0,31);
            daysInMonth.set(1,28);
            daysInMonth.set(2,31);
            daysInMonth.set(3,30);
            daysInMonth.set(4,31);
            daysInMonth.set(5,30);
            daysInMonth.set(6,31);
            daysInMonth.set(7,31);
            daysInMonth.set(8,30);
            daysInMonth.set(9,31);
            daysInMonth.set(10,30);
            daysInMonth.set(11,31);
        }
        else if (f==true)
        {
            daysInMonth.set(0,31);
            daysInMonth.set(1,29);
            daysInMonth.set(2,31);
            daysInMonth.set(3,30);
            daysInMonth.set(4,31);
            daysInMonth.set(5,30);
            daysInMonth.set(6,31);
            daysInMonth.set(7,31);
            daysInMonth.set(8,30);
            daysInMonth.set(9,31);
            daysInMonth.set(10,30);
            daysInMonth.set(11,31);
        }
        
    }

    // A constructor for the class to initialize values from integer year month and date.
    public Date (int year, int month, int day)
    {
        setDate(year, month, day);
        initDaysInMonth(this.year);
    }
    // A constructor for the class to initialize values from a string in the format YYYY-MM-DD
    public Date (String date)
    {
        int indexDash = date.indexOf("-");
        int indexDash2 = date.indexOf("-", indexDash+1);
        int year2 = Integer.parseInt(date.substring(0,indexDash));
        int month2 = Integer.parseInt(date.substring(indexDash+1,indexDash2));
        int day2 = Integer.parseInt(date.substring(indexDash2+1));
        setDate(year2, month2, day2);
        initDaysInMonth(this.year);
    }
    // A copy constructor for the class
    public Date (Date s)
    {
        this.day = s.day;
        this.month = s.month;
        this.year = s.year;
    }
    private int getDaysInMonth(int i)
    {
        int days = daysInMonth.get(i);
        return days;
    }
    public int getYears()
    {
        return this.year;
    }
    public int getMonth()
    {
        return this.month;
    }
    public int getday()
    {
        return this.day;
    }
    // A Method to set date in the class
    public void setDate(int year,int month, int day)
    {   this.year = year;
        initDaysInMonth(this.year);

        if (month>0 && month<13)
        {
            this.month = month;
        }
        else
        {
            this.month = 1;
        }
        if (day <= getDaysInMonth(month-1))
        {
            this.day = day;
        }
        else
        {
            this.day = 1;
        }
    }
    // A Method to check if the year is leap year. 
    public boolean isLeapYear(int year)
    {
        boolean f = false;
        if (year%100 == 0)
        {
            if (year%400 == 0)
            {
                f = true;
            }
            else 
            {
                f = false;
            }
        }
        else if (year%100!=0)
        {
            if (year%4 == 0)
            {
                f = true;
            }
            else 
            {
                f =false;
            }
        }
        return f;
    }
    // A method to display the Date class objects as a string.
    public String toString()
    {

        String output = "";
        if(month>9 && day > 9)
        {
            output = year + "-" + month + "-" + day;
        }
        else if (month > 9 && day <= 9)
        {
            output = year + "-" + month + "-0" + day;
        }
        else if (month <= 9 && day > 9)
        {
            output = year + "-0" + month + "-" + day;
        }
        else if (month <=9 && day <= 9)
        {
            output = year + "-0" + month + "-0" + day;
        }
        return output;
    }
    // A method to calculate days between 2 dates.
    public int daysBetween(Date s)
    {
        int day2 = s.getday();
        int month2 = s.getMonth();
        int year2 = s.getYears();
        int totalDays = 0;
        int leapYearCount= 0;
        int totalDays2 = 0;
        int leapYearCount2=0;
        int betweenDays;
        initDaysInMonth(1);
        if (month2<=2)
        {
            year2--;
        }
        leapYearCount2 = leapYearCount2 + ( year2/4 - year2 / 100 + year2/400);
        if (month2<=2)
        {
            year2++;
        }
        totalDays2 = year2*365 + day2;
        int n = month2 - 1;
        int m = month - 1 ;
        for(int i = 0; i < n ;i++)
        {
            totalDays2 = totalDays2 + getDaysInMonth(i);
        }
        totalDays2 = totalDays2 + leapYearCount2;
        if (month<=2)
        {
            year--;
        }
        leapYearCount = leapYearCount +  (year/4 - year / 100 + year/400);
        if (month<=2)
        {
           year++;
        }
        totalDays = year*365 + day;
        for(int i = 0; i < m ;i++)
        {
            totalDays = totalDays + getDaysInMonth(i);
        }
        totalDays = totalDays + leapYearCount;
        betweenDays = Math.abs(totalDays - totalDays2);
        return betweenDays;
    }
    // A method to check if a date comes before the other date passed as Date object as parameter
    public boolean isBefore(Date s)
    {
        int day2 = s.day;
        int month2 = s.month;
        int year2 = s.year;
        int totalDays = 0;
        int leapYearCount= 0;
        int totalDays2 = 0;
        int leapYearCount2=0;
        int betweenDays;
        initDaysInMonth(1);
        boolean f = false;
        if (month2<=2)
        {
            year2--;
        }
        leapYearCount2 = year2/4 - year2 / 100 + year2/400;
        if (month2<=2)
        {
            year2++;
        }
        totalDays2 = year2*365 + day2;
        for(int i = 0; i < month2-1;i++)
        {
            totalDays2 = totalDays2 + getDaysInMonth(i);
        }
        totalDays2 = totalDays2 + leapYearCount2;
        if (this.month<=2)
        {
            this.year--;
        }
        leapYearCount = this.year/4 - this.year / 100 + this.year/400;
        if (this.month<=2)
        {
            this.year++;
        }
        
        totalDays = this.year*365 + this.day;
        for(int i = 0; i < this.month-1;i++)
        {
            totalDays = totalDays + getDaysInMonth(i);
        }
        totalDays = totalDays + leapYearCount;
        
        
        betweenDays = totalDays - totalDays2;
        if (betweenDays<0)
        {
            f = true;
        }
        else if (betweenDays>0)
        {
            f = false;
        }
        return f;

    }
    // A method to add number of days passed as paramter to a date stored in Date object.
    public void addDays(int numberOfDays)
    {
        initDaysInMonth(this.year);
        while (numberOfDays != 0)
        {
            while (month<13)
            {
                int i = month - 1;
                while (this.day < getDaysInMonth(i))
                {
                    if (numberOfDays == 0)
                    {
                        break;
                    }
                    day++;
                    numberOfDays--;
                }
                if (numberOfDays == 0)
                {
                    break;
                }
                month++;
                day = 0;
            }
            if(numberOfDays == 0)
            {
                break;
            }
            year++;
            month = 1;
            initDaysInMonth(this.year);
            
        }


    }
}
