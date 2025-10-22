package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String formattedName = NameFormatter.format("Dr. Mel B Johnson PhD");
        System.out.println(formattedName);
        String formattedName2 = NameFormatter.format("Roger", "Su");
        System.out.println(formattedName2);
        String formattedName3 = NameFormatter.format("Dr.", "Roger", "D", "Su", "PhD");
        System.out.println(formattedName3);
        String formattedName5 = NameFormatter.format("Dr.", "Roger", "", "Su", "PhD");
        System.out.println(formattedName5);
        String formattedName4 = NameFormatter.format("Mel Johnson");
        System.out.println(formattedName4);
        String formattedName6 = NameFormatter.format("Dr.", "Roger", "", "", "PhD");
        System.out.println(formattedName6);
    }


}
