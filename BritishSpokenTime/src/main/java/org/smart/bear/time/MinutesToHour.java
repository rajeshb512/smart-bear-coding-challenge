package org.smart.bear.time;

import org.smart.bear.util.BritishTimeUtils;

public class MinutesToHour implements BritishTimeSpoken {

    @Override
    public boolean matches(int hours, int minutes) {
        return minutes > 30 && minutes < 60;
    }

    @Override
    public String format(int hours, int minutes) {
        int toMinutes = 60 - minutes;
        int nextHour = (hours + 1) % 12 == 0 ? 12 : (hours + 1) % 12;
        return BritishTimeUtils.minuteToWords(toMinutes) + " to " + BritishTimeUtils.hourToWords(nextHour);
    }
}
