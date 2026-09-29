package mypackage;

public class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void display() {
        System.out.println("Student Details");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Rahul");
        s.display();
    }
}
