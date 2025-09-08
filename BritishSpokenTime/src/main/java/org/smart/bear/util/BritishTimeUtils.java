package org.smart.bear.util;

public class BritishTimeUtils {

    private static final String[] HOURS = {
            "twelve", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven"
    };

    private static final String[] MINUTES = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three",
            "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine"
    };

    public static String hourToWords(int hour) {
        return HOURS[hour % 12];
    }

    public static String minuteToWords(int minute) {

        if (minute == 15 || minute == 45) {
            return "quarter";
        }
        if (minute == 30) {
            return "half";
        }
        if (minute <= 29) {
            return MINUTES[minute];
        }
        return String.valueOf(minute);
    }
}
