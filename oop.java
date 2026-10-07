import java.util.*;

class student {
    String name;
    int roll;

    // default constructor
    student() {
        name = "priyanshu";
        roll = 2;
    }

    student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + name + ", roll : " + roll);
    }
}

public class oop {
    public static void main(String[] args) {
        student s1 = new student();
        System.out.print("Student 1 (Default): ");
        s1.display();
        student s2 = new student("Alex", 19);
        System.out.print("Student 2 (Parameterized): ");
        s2.display();

    }
}
