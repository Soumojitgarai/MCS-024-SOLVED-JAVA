public class University {

    public static void main(String[] args) {
        // Graduate students
        GraduateStudent g1 = new GraduateStudent("Alice", 22, "Computer Science", 85.0);
        GraduateStudent g2 = new GraduateStudent("Bob", 24, "Economics", 90.0);

        // Research students
        ResearchStudent r1 = new ResearchStudent("Charlie", 28, "AI", 3, 1);
        ResearchStudent r2 = new ResearchStudent("Diana", 30, "Biomedical Engineering", 5, 0);

        // Polymorphic display using overridden methods
        System.out.println("Graduate Students:");
        displayStudentInfo(g1);
        displayStudentInfo(g2);

        System.out.println("\nResearch Students:");
        displayStudentInfo(r1);
        displayStudentInfo(r2);
    }

    private static void displayStudentInfo(Student student) {
        student.displayStudentInfo(); // Overridden in subclasses for specific details
    }
}

class Student {
    protected String name;
    protected int age;
    protected String program;

    public Student(String name, int age, String program) {
        this.name = name;
        this.age = age;
        this.program = program;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
    }
}

class GraduateStudent extends Student {
    private double percentageMarks;
    private String stream;

    public GraduateStudent(String name, int age, String program, double percentageMarks, String stream) {
        super(name, age, program); // Call superclass constructor for common attributes
        this.percentageMarks = percentageMarks;
        this.stream = stream;
    }

    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo(); // Display common attributes from superclass
        System.out.println("Percentage Marks: " + percentageMarks);
        System.out.println("Stream: " + stream);
    }
}

class ResearchStudent extends Student {
    private String specialization;
    private int yearsOfExperience;

    public ResearchStudent(String name, int age, String program, String specialization, int yearsOfExperience) {
        super(name, age, program); // Call superclass constructor for common attributes
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo(); // Display common attributes from superclass
        System.out.println("Specialization: " + specialization);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
}
