package org.smart.bear.time;

import org.smart.bear.util.BritishTimeUtils;

public class QuarterPast implements BritishTimeSpoken {
    @Override
    public boolean matches(int hours, int minutes) {
        return minutes == 15;
    }

    @Override
    public String format(int hours, int minutes) {
        return "quarter past " + BritishTimeUtils.hourToWords(hours);
    }
}
