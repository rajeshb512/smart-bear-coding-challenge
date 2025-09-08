package org.smart.bear.service;

import org.smart.bear.time.*;

import java.util.Arrays;
import java.util.List;

public class BritishSpokenTimeService {

    private final List<BritishTimeSpoken> strategies;

    public BritishSpokenTimeService() {
        strategies = Arrays.asList(
                new OClock(),
                new HalfPast(),
                new Midnight(),
                new Noon(),
                new MinutesToHour(),
                new Past(),
                new QuarterTo(),
                new QuarterPast()
        );

    }

    public String convertToBritishSpokenTime(int hours, int minutes) {
        if (hours < 0 || hours > 12 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Invalid time: " + hours + ":" + minutes);
        }
        return strategies.stream()
                .filter(strategy -> strategy.matches(hours, minutes))
                .findFirst()
                .map(strategy -> strategy.format(hours, minutes))
                .orElseThrow(() -> new IllegalArgumentException("No matching strategy for time: " + hours + ":" + minutes));
    }
}
