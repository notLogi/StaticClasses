package com.pluralsight;

public class NameFormatter {

    private NameFormatter(){}

    public static String format(String firstName, String lastName){
        if(firstName.isEmpty() || lastName.isEmpty()){
            System.out.println("Need first or last name.");
            return null;
        }
        return format("", firstName, "", lastName, "");
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        if(firstName.isEmpty() || lastName.isEmpty()){
            System.out.println("Need first or last name.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lastName).append(lastName.contains(",") ? " " : ", ").append(prefix.isEmpty() ? "" : prefix + " ").append(firstName).append(middleName.isEmpty() ? "" : " " + middleName).append(suffix.isEmpty() ? "" : ", " + suffix);
        return sb.toString().trim();
    }

    public static String format(String fullName){
        String[] input = fullName.split(" ");
        input[0] = input[0].trim();
        input[input.length - 1] = input[input.length - 1].trim();
        return switch (input.length) {
            case 2 -> input[1] + ", " + input[0];
            case 4 -> input[3] + ", " + input[0] + " " + input[1] + " " + input[2];
            default -> format(input[0], input[1], input[2], input[3], input[4]);
        };
    }


}
