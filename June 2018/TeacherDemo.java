public class TeacherDemo {

    public static void main(String[] args) {
        Professor prof = new Professor("John Doe", "Computer Science", 10);
        AssociateProfessor assocProf = new AssociateProfessor("Jane Doe", "Mathematics", 7);
        AssistantProfessor assistProf = new AssistantProfessor("Alice Smith", "English", 4);

        prof.displayInfo();
        assocProf.displayInfo();
        assistProf.displayInfo();
    }
}

class Teacher {
    private String name;
    private String department;

    public Teacher(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Professor extends Teacher {
    private int yearsOfExperience;

    public Professor(String name, String department, int yearsOfExperience) {
        super(name, department);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Years of experience: " + yearsOfExperience);
    }
}

class AssociateProfessor extends Teacher {
    private int researchArea;

    public AssociateProfessor(String name, String department, int i) {
        super(name, department);
        this.researchArea = i;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research area: " + researchArea);
    }
}

class AssistantProfessor extends Teacher {
    private int PhdAdvisor;

    public AssistantProfessor(String name, String department, int i) {
        super(name, department);
        this.PhdAdvisor = i;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("PhD Advisor: " + PhdAdvisor);
    }
}
