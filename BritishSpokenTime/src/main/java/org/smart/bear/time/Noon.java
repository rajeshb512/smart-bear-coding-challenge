package org.smart.bear.time;

public class Noon implements BritishTimeSpoken {

    @Override
    public boolean matches(int hours, int minutes) {
        return (hours == 12 || hours == 0) && minutes == 0;
    }

    @Override
    public String format(int hours, int minutes) {
        return "noon";
    }
}
