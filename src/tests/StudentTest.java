package src.tests;

import org.junit.jupiter.api.Test;
import src.people.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the Student class.
 */
public class StudentTest {
    /**
     * Tests the getFavoriteSubject method of the Student class.
     */
    @Test
    public void testGetFavoriteSubject() {
        Student student = new Student("Alice", 18, "Math");
        assertEquals("Math", student.getFavoriteSubject());
    }

    /**
     * Tests the receiveGrade method of the Student class.
     */
    @Test
    public void testReceiveGrade() {
        Student student = new Student("Alice", 18, "Math");
        student.receiveGrade(85);
        assertEquals(1, student.getGrades().size());
        assertEquals(85, student.getGrades().get(0));
    }
}

