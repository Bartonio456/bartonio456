package src.tests;

import org.junit.jupiter.api.Test;
import src.people.Student;
import src.people.Teacher;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the Teacher class.
 */
public class TeacherTest {
    /**
     * Tests the getSubject method of the Teacher class.
     */
    @Test
    public void testGetSubject() {
        Teacher teacher = new Teacher("Mr. Jones", 40, "Physics");
        assertEquals("Physics", teacher.getSubject());
    }

    /**
     * Tests the grade method of the Teacher class.
     */
    @Test
    public void testGrade() {
        Student student = new Student("JUne", 30, "Math");
        Teacher teacher = new Teacher("Mr. Jones", 40, "Math");

        teacher.grade(student);

        assertEquals(1, student.getGrades().size());
        int grade = student.getGrades().get(0);
        assertEquals(true, grade >= 3 && grade <= 6);
    }
}
