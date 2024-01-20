
//Author: Moin Khan
//Program to convert gıven seconds to weeks, days, hour and seconds.
public class Lab01_Q2_MoinKhan {
    public static void main(String[] args) {
        final int NOOFSECONDS = 180540;
        final int ONEHOURINSECONDS = 3600;
        final int ONEDAYINSECONDS = 86400;
        final int ONEWEEKINSECONDS = 604800;
        final int ONEMINUTEINSECONDS = 60;

        int weeks;
        int days;
        int hours;
        int minutes;
        int seconds;
        weeks = NOOFSECONDS / ONEWEEKINSECONDS;
        days = ( NOOFSECONDS % ONEWEEKINSECONDS ) / ONEDAYINSECONDS;
        hours = ( ( NOOFSECONDS % ONEWEEKINSECONDS ) % ONEDAYINSECONDS ) / ONEHOURINSECONDS;
        minutes = ( ( ( NOOFSECONDS % ONEWEEKINSECONDS ) % ONEDAYINSECONDS ) % ONEHOURINSECONDS ) / ONEMINUTEINSECONDS ;
        seconds = ( ( ( NOOFSECONDS % ONEWEEKINSECONDS ) % ONEDAYINSECONDS ) % ONEHOURINSECONDS ) % ONEMINUTEINSECONDS ;

        System.out.println( NOOFSECONDS+" seconds represents " + weeks + " weeks " + days + " days " +
            hours + " hours " + minutes + " minutes " + seconds + " seconds");
        



    }
}
