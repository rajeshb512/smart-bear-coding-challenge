package org.smart.bear.time;

import org.smart.bear.util.BritishTimeUtils;

public class Past implements BritishTimeSpoken {

    @Override
    public boolean matches(int hours, int minutes) {
        return minutes > 0 && minutes < 30;
    }

    @Override
    public String format(int hours, int minutes) {
        return BritishTimeUtils.minuteToWords(minutes) + " past " + BritishTimeUtils.hourToWords(hours);
    }
}
