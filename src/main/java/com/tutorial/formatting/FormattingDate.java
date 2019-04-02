package com.tutorial.formatting;

import java.util.Calendar;

public class FormattingDate {

    public static void main(String[] args) {
        /*
            H M S - Hour Min S
            L N   - Millisecond Nanosecond
            p     - AM / PM
            Z     - Zone

            A B Y - Day of Week, Month of year, YYYY
            d m y - 2 digit day of month, 2 digit month of year, YY

         */

        System.out.printf("%1$td/%1$tm/%1$ty%n", Calendar.getInstance());

        System.out.printf("%1$tY%1$tm%1$td%n%n",Calendar.getInstance());

        System.out.printf("%1$tA - %1$td%n%1$tB - %1$tm%n%1$tY%n%1$tH:%1$tM:%1$tS %1$tL %1$tN %1$tp %1$tZ%n",Calendar.getInstance());
    }
}
