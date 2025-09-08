package org.smart.bear;

import org.smart.bear.service.BritishSpokenTimeService;

import java.util.Scanner;

public class BritishSpokenTimeApplication {

    public static void main(String[] args) {
        BritishSpokenTimeService service = new BritishSpokenTimeService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in HH:MM format : ");
        String inputTime = scanner.nextLine();
        String[] parts = inputTime.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        System.out.println(service.convertToBritishSpokenTime(hours, minutes));
    }
}
