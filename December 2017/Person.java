public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}

public class ObjectPassingExample {

    public static void greetPerson(Person person) { // Method that takes a Person object as a parameter
        System.out.println("Greetings, " + person.name + "!");
        person.introduce();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        greetPerson(person1); // Pass person1 object to the greetPerson method
        greetPerson(person2); // Pass person2 object to the greetPerson method
    }
}