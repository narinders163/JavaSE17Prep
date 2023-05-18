package Enums;

import records.AccessingStudents;

import javax.swing.text.Highlighter;

public enum Seasons implements SeasonTemperatures {
    WINTER(5), SUMMER(5), SPRING(1), FALLS(1);
    private final int months;
    Seasons(int months) {
        this.months = months;
    }
    public int getMonths() {
        return months;
    }

    @Override
    public void winterTemp() {
        System.out.println("lowest is -20C");
    }

    @Override
    public void summerTemp() {
        System.out.println("Highest is 38C");
    }

    @Override
    public void springTemp() {
        System.out.println("Highest is 25C");
    }

    @Override
    public void fallsTemp() {
        System.out.println("Highest is 15C");
    }
}
class accessing{
    public static void main(String[] args) {
        Seasons[] values = Seasons.values();
        for(Seasons s:values){
            System.out.println(s+" ordinal is: "+s.ordinal()+" and this season stays for "+s.getMonths()+" months");
        }
        Seasons falls = Seasons.WINTER;
        var result = switch (falls){
            case FALLS -> "love it";
            case WINTER -> "Snow";
            case SUMMER -> "feels good";
            case SPRING -> "lovely";
            case default -> "No idea what it is";
        };
        System.out.println(result+" "+"for "+falls.getMonths()+" months");
        falls.fallsTemp();
    }
}
