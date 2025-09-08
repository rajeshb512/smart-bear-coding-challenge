package org.smart.bear.time;

public class Midnight implements BritishTimeSpoken {

    @Override
    public boolean matches(int hours, int minutes) {
        return hours == 0 && minutes == 0;
    }

    @Override
    public String format(int hours, int minutes) {
        return "midnight";
    }
}
