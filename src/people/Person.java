package src.people;

/**
 * Represents a person with a name and age.
 */
public class Person {
    private final String name;
    private final int age;

    /**
     * Constructs a person object with the given name and age.
     *
     * @param name The name of the person.
     * @param age  The age of the person.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Retrieves the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Prints an introduction message for the person.
     */
    public void introduce() {
        System.out.println("I'm " + name + " and I'm " + age + " years old.");
    }
}
