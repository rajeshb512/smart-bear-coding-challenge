package org.smart.bear.time;

import org.smart.bear.util.BritishTimeUtils;

public class OClock implements BritishTimeSpoken {

    @Override
    public boolean matches(int hours, int minutes) {
        return minutes == 0 && hours != 0 && hours != 12;
    }

    @Override
    public String format(int hours, int minutes) {
        return BritishTimeUtils.hourToWords(hours) + " o'clock";
    }
}
