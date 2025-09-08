package org.smart.bear.time;

public interface BritishTimeSpoken {

    boolean matches(int hours, int minutes);

    String format(int hours, int minutes);
}
