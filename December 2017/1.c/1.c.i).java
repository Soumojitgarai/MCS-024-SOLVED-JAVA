class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Initialize a Person object with dynamic values
Person person = new Person("John", 30);
System.out.println("Name: " + person.name + ", Age: " + person.age);
