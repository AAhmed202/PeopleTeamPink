package org.example;
import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//Tests are ordered to ensure correct personCount is checked for


public class PersonTest {
    Person person1 = new Person("John", "Boris", LocalDate.of(1998, 05, 21));
    @After
    //Resets count to zero before next test is run
    public void reset() {
        person1.resetCount();
    }

    @Test
    public void getAge() {
        //Person person1 = new Person("Steve", "Smith", LocalDate.of(1998, 03, 12));
        int expectedAge = 25;
        int generatedAge = person1.getAge();
        assertEquals(expectedAge,generatedAge);
    }

    @Test
    public void getFormattedString() {
        //Person person2 = new Person("John", "Boris", LocalDate.of(1998, 05, 21));
        String expectedString = "First Name: John\nLast Name: Boris\nDOB: 21-05-1998\nAge: 25\nNumber of People: 1";
        String formattedString = person1.getFormattedString();
        assertEquals(expectedString,formattedString);
    }

    @Test
    public void getPersonCount() {
        //Person person3 = new Person("Steve", "Bruce", LocalDate.of(1986,9, 11));
        int expectedCount = 1;
        int generatedCount = person1.getCount();
        assertEquals(expectedCount,generatedCount);
    }

    @Test
    public void getPersonCount2() {
        Person person2 = new Person("Daniel", "Boris", LocalDate.of(2003, 12, 21));
        Person person3 = new Person("Ali", "Ahmed", LocalDate.of(1995, 04, 21));
        Person person4 = new Person("John", "Jake", LocalDate.of(1062, 01, 28));
        int expectedCount = 4;
        int generatedCount = person1.getCount();
        assertEquals(expectedCount,generatedCount);
    }
}