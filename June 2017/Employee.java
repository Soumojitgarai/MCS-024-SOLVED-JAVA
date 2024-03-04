public class Employee {
    private int employeeNumber;
    private String name;
    private double salary;

    public Employee(int employeeNumber, String name, double salary) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void giveRaise(double percentage) {
        this.salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Department {
    private String name;
    private Employee head;

    public Department(String name, Employee head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee newHead) {
        this.head = newHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head=" + head +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1234, "Alice", 50000);
        Employee emp2 = new Employee(5678, "Bob", 45000);

        Department dept1 = new Department("Marketing", emp1);
        Department dept2 = new Department("Development", emp2);

        System.out.println("Initial department heads:");
        System.out.println(dept1);
        System.out.println(dept2);

        // Simulate yearly transitions
        emp2.giveRaise(5); // Apply raise to Bob
        dept1.setHead(emp2);   // Make Bob head of Marketing

        System.out.println("\nAfter transitions and raise:");
        System.out.println(dept1);
        System.out.println(dept2);
    }
}