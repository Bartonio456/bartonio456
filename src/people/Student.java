package src.people;

import java.util.ArrayList;

/**
 * Represents a student, inheriting from the Person class, with a favorite subject and a list of grades.
 */
public class Student extends Person {
    private final String favoriteSubject;
    private final ArrayList<Integer> grades;

    /**
     * Constructs a student object with the given name, age, and favorite subject.
     *
     * @param name            The name of the student.
     * @param age             The age of the student.
     * @param favoriteSubject The favorite subject of the student.
     */
    public Student(String name, int age, String favoriteSubject) {
        super(name, age);
        this.favoriteSubject = favoriteSubject;
        this.grades = new ArrayList<>();
    }

    /**
     * Retrieves the favorite subject of the student.
     *
     * @return The favorite subject of the student.
     */
    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    /**
     * Retrieves a copy of the list of grades of the student.
     *
     * @return A copy of the list of grades of the student.
     */
    public ArrayList<Integer> getGrades() {
        // Copy list of grades to prevent modifying it.
        return new ArrayList<Integer>(grades);
    }

    /**
     * Adds a grade to the list of grades of the student.
     *
     * @param grade The grade to be added.
     */
    public void receiveGrade(int grade) {
        this.grades.add(grade);
    }

    /**
     * Calculates and retrieves the final grade of the student based on the average of the grades.
     * If the student has no grades, the final grade is 1.
     *
     * @return The final grade of the student.
     */
    public int getFinalGrade() {
        if (grades.size() == 0) {
            // If student has no grades, the final grade is 1.
            return 1;
        }

        int sum = 0;
        for (var grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    /**
     * Prints an introduction message for the student, including their name, age, and favorite subject.
     */
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("My favorite subject is " + favoriteSubject + ".");
    }
}
