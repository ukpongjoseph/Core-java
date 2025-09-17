package ChapterTwo;

public class ShowTime {
    // One public class per package
    // No method nested in a method
    // All codes should be inside the public class
    // Execution starts from main

    // This method is a program that displays the time in GMT (GreenWich Mean Time) in the format hours:minutes:seconds
    // We will be using the System.currentTimeMillis method from the System class to get the time, then we will transform it into hours, minutes and seconds format
    public static void showTime(){
        // Now that we have time stored in the variable in form of milliseconds, time. We will be getting the number of hours, minutes and seconds from the time
        long time = System.currentTimeMillis();
        long totalSeconds = time/1000;
        // Now tha we have the total seconds, we then can get the current seconds (the seconds in the time)
        long currentSeconds = totalSeconds % 60;
        // lets get the current minutes
        long totaltMinutes = totalSeconds/60;
        long currentMinutes = totaltMinutes%60;
        // lets get the total minutes which will be used to get the current hours and total hours
        // now that we have the total minutes, lets get the current hour
        long currentHour = totaltMinutes %24;
        // now let us get the total hour
        long totalHour = totaltMinutes/60;
        System.err.println("The current time is " + currentHour + "h:" + currentMinutes + "m:" + currentSeconds + "s");
        

    }
    public static void main(String args[]){
        showTime();
    }
}
