package src.tests;

import org.junit.jupiter.api.Test;
import src.people.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the Person class.
 */
public class PersonTest {
    /**
     * Tests the getName method of the Person class.
     */
    @Test
    public void testGetName() {
        Person person = new Person("jd", 30);
        assertEquals("jd", person.getName());
    }

    /**
     * Tests the getAge method of the Person class.
     */
    @Test
    public void testGetAge() {
        Person person = new Person("jd", 30);
        assertEquals(30, person.getAge());
    }
}
