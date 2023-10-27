package org.example;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Date;

public class Person {
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

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
        /*System.out.printf("First Name: %s %n", this.firstName );
        System.out.printf("Last Name: %s %n", this.lastName );*/

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        /*System.out.printf("DOB: %s %n", this.dateOfBirth.format(myFormatObj) );

        System.out.printf("Age: %d %n", this.getAge() );
        System.out.printf("Number of People: %d %n", personCount );*/

        return "First Name: " + this.firstName +
                "\nLast Name: " + this.lastName +
                "\nDOB: " + this.dateOfBirth.format(myFormatObj) +
                "\nAge: " + this.getAge() +
                "\nNumber of People: "+ personCount;
    }

    public int getCount() {
        return personCount;
    }

}
