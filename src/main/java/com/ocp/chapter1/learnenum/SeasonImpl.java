package com.ocp.chapter1.learnenum;

/**
 * Created by KV on 5/5/2016.
 */
public enum SeasonImpl {

    WINTER("Winter") {
        public void getHours() {
            System.out.printf("%s) 10:00 AM - 04:00 PM SEASON TYPE %s%n", this.ordinal(), this.getSeason());
        }
    },
    SPRING("Spring") {
        public void getHours() {
            System.out.printf("%s) 10:00 AM - 05:00 PM SEASON TYPE %s%n", this.ordinal(), this.getSeason());
        }
    },
    SUMMER("Summer") {
        public void getHours() {
            System.out.printf("%s) 08:30 AM - 07:00 PM SEASON TYPE %s%n", this.ordinal(), this.getSeason());
        }
    },
    FALL("Fall") {
        public void getHours() {
            System.out.printf("%s) 09:30 AM - 06:00 PM SEASON TYPE %s%n", this.ordinal(), this.getSeason());
        }
    }, RAIN("RAIN");

    private String season;

    SeasonImpl(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    private void getHours() {
        System.out.printf("%s) 09:30 AM - 06:00 PM SEASON TYPE %s%n", this.ordinal(), this.getSeason());
    }

    public static void main(String... a) {
        for (SeasonImpl impl : SeasonImpl.values()) {
            impl.getHours();
        }
    }
}
