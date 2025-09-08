package org.smart.bear.time;

import org.smart.bear.util.BritishTimeUtils;

public class QuarterTo implements BritishTimeSpoken {

    @Override
    public boolean matches(int hours, int minutes) {
        return minutes == 45;
    }

    @Override
    public String format(int hours, int minutes) {
        return "quarter to " + BritishTimeUtils.hourToWords((hours + 1) % 12 == 0 ? 12 : (hours + 1) % 12);
    }
}
