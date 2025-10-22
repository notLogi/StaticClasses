package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {
    @Test
    public void firstlastnametogether_should_format(){
        String name = "Roger Su";
        //act
        String formattedName = NameFormatter.format(name);

        assertEquals("Su, Roger", formattedName);
    }

    @Test
    public void firstlastnameseparate_should_format(){
        String firstName = "Roger";
        String lastName = "Su";
        String formattedName = NameFormatter.format(firstName, lastName);
        assertEquals("Su, Roger", formattedName);
    }

    @Test
    public void fullname_should_format(){
        String name = "Dr. Roger D Su, PhD";
        String formattedName = NameFormatter.format(name);
        assertEquals("Su, Dr. Roger D, PhD", formattedName);
    }

    @Test
    public void fullnameseparate_should_format(){
        String firstName = "Roger";
        String lastName = "Su";
        String prefix = "Dr.";
        String suffix = "PhD";
        String middle = "D";
        String formattedName = NameFormatter.format(prefix, firstName, middle, lastName, suffix);
        assertEquals("Su, Dr. Roger D, PhD", formattedName);
    }

}