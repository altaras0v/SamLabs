package com.Tarasov.Time;

/**
 * Creates time
 */
public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    /**
     * Constructor of time
     * @param seconds - value of seconds
     */
    public Time(int seconds){
        this.seconds = seconds;
    }

    /**
     * Constructor of time
     * @param seconds - value of seconds
     * @param minutes - value of minute
     * @param hours - value of hours
     */
    public  Time(int seconds,int minutes,int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    /**
     * Converts value of time to seconds
     * @return value of seconds
     */
    public int convertToSeconds(){
        return this.hours*3600+this.minutes*60+this.seconds;
    }

    /**
     * Converts value of time that user entered to normal view
     * @param seconds - value of time in seconds
     */
    private void convertSecondsToTime(int seconds){
        seconds = Math.abs(seconds);
        this.hours = seconds / 3600 % 24;
        seconds %= 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }

    /**
     * Shows value of time like "hours,minutes,seconds"
     */
    public void showTime(){
        convertSecondsToTime(convertToSeconds());
        System.out.printf("%s %d%s %d%s %d%s","Время:",this.hours,"h",this.minutes,"m",this.seconds,"s\n");
    }
}
