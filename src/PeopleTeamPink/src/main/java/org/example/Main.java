package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Boris", LocalDate.of(1998, 05, 21));
        Person person2 = new Person("Ali", "Ahmed", LocalDate.of(1995, 04, 21));
        Person person3 = new Person("John", "Jake", LocalDate.of(1062, 01, 28));

        person2.getFormatedString();

    }
}