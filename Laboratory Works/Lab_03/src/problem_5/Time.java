package problem_5;

public class Time implements Comparable<Time> {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {}

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

    @Override
    public int compareTo(Time o) {
        if (this.hours > o.hours) return 1;
        else if (this.hours < o.hours) return -1;
        else if (this.minutes > o.minutes) return 1;
        else if (this.minutes < o.minutes) return -1;
        else if (this.seconds > o.seconds) return 1;
        else if (this.seconds < o.seconds) return -1;
        return 0;
    }
}
