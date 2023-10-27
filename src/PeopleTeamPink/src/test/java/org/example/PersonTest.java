package org.example;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;

public class PersonTest {
    Person person1 = new Person("John", "Boris", LocalDate.of(1998, 05, 21));

    @Test
    public void getAge() {
        int expectedAge = 25;
        int generatedAge = person1.getAge();
        assertEquals(expectedAge,generatedAge);
    }

    @Test
    public void getFormatedString() {
    }
}