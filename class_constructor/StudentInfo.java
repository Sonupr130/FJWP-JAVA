package class_constructor;

class Student {
    String name;
    int age;
    String department;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }

    // Constructor with two parameters: name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        department = "IT";
    }

    // Constructor with three parameters: name, age, and department
    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Display method to print student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        // Create instances of Student using each constructor
        Student std1 = new Student(); 
        Student std2 = new Student("Ashish", 20);  
        Student std3 = new Student("Umang", 21, "IT");  

        // Print the details of each student
        System.out.println("Student-1 Details:");
        std1.display();
        System.out.println();

        System.out.println("Student-2 Details:");
        std2.display();
        System.out.println();

        System.out.println("Student-3 Details:");
        std3.display();
        System.out.println();
    }
}

//------------- OUTPUT -----------------------------

//Student-1 Details:
//Name: Unknown
//Age: 20
//Department: Unassigned
//
//Student-2 Details:
//Name: Ashish
//Age: 20
//Department: IT
//
//Student-3 Details:
//Name: Umang
//Age: 21
//Department: IT
