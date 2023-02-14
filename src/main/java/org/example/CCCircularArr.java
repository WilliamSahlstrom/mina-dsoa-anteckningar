package org.example;

public class CCCircularArr {
    public CCCircularArr() {
        /**
         * CODE CHALLENGE Circular Arr-gument
         */
        String[] weekDays = { "må", "ti", "on", "to", "fr", "lö", "sö" };
        int today = 1; // tisdag
        System.out.printf("I dag är det %s\n",weekDays[today]);
        System.out.printf("I övermorgon är det %s\n", weekDays[today+2]);

        System.out.printf("Om 7 dagar är det %s\n", weekDays[today+7 % weekDays.length]);
        System.out.printf("Om 15 dagar är det %s\n",weekDays[today+15 % weekDays.length]);

    }
}
