package src.people;

import java.util.Random;

/**
 * Represents a teacher, inheriting from the Person class, with a subject they teach.
 */
public class Teacher extends Person {
    private final String subject;

    /**
     * Constructs a teacher object with the given name, age, and subject they teach.
     *
     * @param name    The name of the teacher.
     * @param age     The age of the teacher.
     * @param subject The subject the teacher teaches.
     */
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    /**
     * Retrieves the subject the teacher teaches.
     *
     * @return The subject the teacher teaches.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Assigns a grade to a student based on the teacher's subject and randomness.
     * If the teacher teaches the student's favorite subject, the grade is from 3 to 6.
     * Otherwise, the grade is from 1 to 4.
     *
     * @param student The student to grade.
     */
    public void grade(Student student) {
        int grade;
        Random random = new Random();
        if (student.getFavoriteSubject().equals(subject)) {
            grade = random.nextInt(3, 7);
        } else {
            grade = random.nextInt(2, 5);
        }

        student.receiveGrade(grade);
    }

    /**
     * Prints an introduction message for the teacher, including their name, age, and subject they teach.
     */
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I teach " + subject + ".");
    }
}
