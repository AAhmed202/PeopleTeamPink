package org.example;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String firstName, lastName;
    private LocalDate dateOfBirth;
    private static int personCount = 0;

    public Person (String fn, String ln, LocalDate dob){
        firstName = fn;
        lastName = ln;
        dateOfBirth = dob;
        personCount++;
    }

    public int getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    public String getFormattedString() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return "First Name: " + this.firstName +
                "\nLast Name: " + this.lastName +
                "\nDOB: " + this.dateOfBirth.format(myFormatObj) +
                "\nAge: " + this.getAge() +
                "\nNumber of People: "+ personCount;
    }

    public void resetCount() {
        personCount = 0;
    }
    public int getCount() {
        return personCount;
    }

}
