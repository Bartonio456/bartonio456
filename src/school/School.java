package src.school;

import src.people.Student;
import src.people.Teacher;

import java.util.ArrayList;

/**
 * Represents a school with teachers and students.
 */
public class School {
    private final ArrayList<Teacher> teachers;
    private final ArrayList<Student> students;

    /**
     * Constructs a School object with empty lists of teachers and students.
     */
    public School() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    /**
     * Adds a teacher to the school.
     *
     * @param teacher The teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Adds a student to the school.
     *
     * @param student The student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Grades every student by every teacher in the school.
     * Prints the grading information for each student.
     */
    public void gradeStudents() {
        for (Teacher teacher : teachers) {
            for (Student student : students) {
                teacher.grade(student);
                System.out.println(teacher.getName() + " graded " + student.getName() + " with a grade of " + student.getGrades().get(student.getGrades().size() - 1));
            }
        }
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
