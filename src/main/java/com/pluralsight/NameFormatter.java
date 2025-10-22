package com.pluralsight;

public class NameFormatter {

    private NameFormatter(){}

    public static String format(String firstName, String lastName){
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }

    public static String format(String fullName){
        String[] input = fullName.split(" ");
        return switch (input.length) {
            case 2 -> input[1] + " " + input[0];
            case 4 -> input[3] + ", " + input[0] + " " + input[1] + ", " + input[2];
            default -> input[3] + " " + input[0] + " " + input[1] + " " + input[2] + ", " + input[4];
        };
    }


}
