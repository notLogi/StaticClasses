package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String formattedName = NameFormatter.format("Dr. Mel B Johnson, PhD");
        System.out.println(formattedName);
        String formattedName2 = NameFormatter.format("Roger", "Su");
        System.out.println(formattedName2);
        String formattedName3 = NameFormatter.format("Dr.", "Roger", "D", "Su", "PhD");
        System.out.println(formattedName3);
    }


}
