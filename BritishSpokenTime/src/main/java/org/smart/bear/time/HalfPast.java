package org.smart.bear.time;

import org.smart.bear.util.BritishTimeUtils;

public class HalfPast implements BritishTimeSpoken {

    @Override
    public boolean matches(int hours, int minutes) {
        return minutes == 30;
    }

    @Override
    public String format(int hours, int minutes) {
        return "half past " + BritishTimeUtils.hourToWords(hours);
    }
}
