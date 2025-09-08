package org.smart.bear.time;

import org.smart.bear.util.BritishTimeUtils;

public class DirectTime implements BritishTimeSpoken {

    @Override
    public boolean matches(int hours, int minutes) {
        return true;
    }

    @Override
    public String format(int hours, int minutes) {
        return BritishTimeUtils.hourToWords(hours) + " " + String.format("%02d", minutes);
    }
}
