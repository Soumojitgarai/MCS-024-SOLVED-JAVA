public class Student {
    String studentName;
    int rollNumber;
    int marks;
 
    // Constructor to initialize student details
    public Student(String studentName, int rollNumber, int marks) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
 
    // Method to display student information
    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
 }  
    public class Main {
    public static void main(String[] args) {
        // Create an array of 10 student objects
        Student[] students = new Student[10];
 
        // Initialize student objects with sample data
        students[0] = new Student("Alice", 101, 85);
        students[1] = new Student("Bob", 102, 92);
        // ... (initialize other student objects)
 
        // Find the student with the highest marks
        Student highestMarksStudent = students[0]; // Assume the first student has the highest marks initially
        for (int i = 1; i < students.length; i++) {
            if (students[i].marks > highestMarksStudent.marks) {
                highestMarksStudent = students[i];
            }
        }
 
        // Display details of the student with highest marks
        System.out.println("\nStudent with highest marks:");
        highestMarksStudent.displayDetails();
    }
 }
 