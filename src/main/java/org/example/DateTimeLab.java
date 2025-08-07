package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Locale;

public class DateTimeLab {
    public static void main(String[] args) {
        // Exercise 1: LocalDate and DateTimeFormatter
        LocalDate today1 = LocalDate.of(2025, 8, 21);

        DateTimeFormatter dtf1_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2_1 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);

        System.out.println("Default format: " + today1);
        System.out.println("Custom format 1: " + today1.format(dtf1_1));
        System.out.println("Custom format 2: " + today1.format(dtf2_1));
        System.out.println();


        // Exercise 2: LocalTime and DateTimeFormatter
        LocalTime now2 = LocalTime.of(16, 45, 30);

        DateTimeFormatter dtf1_2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf2_2 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println("Default format: " + now2);
        System.out.println("24-hour format: " + now2.format(dtf1_2));
        System.out.println("12-hour format with AM/PM: " + now2.format(dtf2_2));
        System.out.println();


        // Exercise 3: LocalDateTime and DateTimeFormatter
        LocalDateTime event3 = LocalDateTime.of(2025, 11, 27, 19, 0, 0);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");

        System.out.println("Default format: " + event3);
        System.out.println("Custom format: " + event3.format(dtf3));
        System.out.println();


        // Exercise 4: The Immutability of Date-Time Objects
        LocalDate startDate = LocalDate.of(2025, 9, 1);

        // Attempt to add 10 days, but don't assign the result
        startDate.plusDays(10);

        System.out.println("Start date after trying to modify it: " + startDate);

        // Now, correctly add 10 days by assigning the result to a new variable
        LocalDate endDate = startDate.plusDays(10);

        System.out.println("The original start date is still: " + startDate);
        System.out.println("The new end date is: " + endDate);
        System.out.println();


        // Exercise 5: Adding and Subtracting Time (plus and minus)
        LocalDateTime baseTime5 = LocalDateTime.of(2025, 10, 15, 10, 30, 0);

        LocalDateTime futureTime5 = baseTime5.plusYears(1).plusMonths(2).plusHours(5);
        LocalDateTime pastTime5 = baseTime5.minusWeeks(3).minusDays(3);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Base time:   " + baseTime5.format(dtf));
        System.out.println("Future time: " + futureTime5.format(dtf));
        System.out.println("Past time:   " + pastTime5.format(dtf));
        System.out.println();


        // Exercise 6: Period - Measuring a Span of Time
        LocalDate date1 = LocalDate.of(2024, 3, 15);
        LocalDate date2 = LocalDate.of(2026, 7, 20);

        Period period = Period.between(date1, date2);

        System.out.print("The period between the two dates is: ");
        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, and ");
        System.out.println(period.getDays() + " days.");
    }
}