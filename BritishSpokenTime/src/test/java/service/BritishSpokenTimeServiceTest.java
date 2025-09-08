package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.smart.bear.service.BritishSpokenTimeService;

public class BritishSpokenTimeServiceTest {

    private final BritishSpokenTimeService britishSpokenTimeService = new BritishSpokenTimeService();

    @Test
    public void testMidnight() {
        Assertions.assertEquals("midnight", britishSpokenTimeService.convertToBritishSpokenTime(0, 0));
    }

    @Test
    public void testNoon() {
        Assertions.assertEquals("noon", britishSpokenTimeService.convertToBritishSpokenTime(12, 0));
    }

    @Test
    public void testHalfPast() {
        Assertions.assertEquals("half past three", britishSpokenTimeService.convertToBritishSpokenTime(3, 30));
    }

    @Test
    public void testQuarterTo() {
        Assertions.assertEquals("quarter to ten", britishSpokenTimeService.convertToBritishSpokenTime(9, 45));
    }

    @Test
    public void testQuarterPast() {
        Assertions.assertEquals("quarter past seven", britishSpokenTimeService.convertToBritishSpokenTime(7, 15));
    }

    @Test
    public void testOClock() {
        Assertions.assertEquals("two o'clock", britishSpokenTimeService.convertToBritishSpokenTime(2, 0));
    }

    @Test
    public void testTwentyFiveTo() {
        Assertions.assertEquals("twenty-five to five", britishSpokenTimeService.convertToBritishSpokenTime(4, 35));
    }

    @Test
    public void testMinutesToHour() {
        Assertions.assertEquals("twenty to six", britishSpokenTimeService.convertToBritishSpokenTime(5, 40));
    }

    @Test
    public void testInvalidHour() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            britishSpokenTimeService.convertToBritishSpokenTime(25, 0);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            britishSpokenTimeService.convertToBritishSpokenTime(-1, 0);
        });
    }

    @Test
    public void testInvalidMinutes() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            britishSpokenTimeService.convertToBritishSpokenTime(5, 60);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            britishSpokenTimeService.convertToBritishSpokenTime(5, -1);
        });
    }
}
