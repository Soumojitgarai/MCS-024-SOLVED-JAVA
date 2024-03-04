public class Student {

    private String name;
    private int age;

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Please provide a valid name.");
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Please provide a valid age between 0 and 120.");
        }
    }

    public int getAge() {
        return age;
    }
}
