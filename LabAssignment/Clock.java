package LabAssignment3;

public class Clock {
    String alarmHour;
    String alarmMinute;

    public void setAlarm(String hour, String minute) {
        alarmHour = hour;
        alarmMinute = minute;
    }
    
    public String getHours() {
        String hours = java.time.LocalTime.now().toString().substring(0, 2);
        return hours;
    }

    public String getMinutes() {
        String min = java.time.LocalTime.now().toString().substring(3, 5);
        return min;
    }

    public String getTime() {
        String time = getHours() + ":" + getMinutes();
        return time;
    }

    

    
}