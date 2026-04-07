package encapsulation;

// Child class (inherits Person)
public class Student extends Person {

    private String studentID;

    public Student(String name, int age, String address, String gender, String studentID) {
        super(name, age, address, gender);
        this.studentID = studentID;
    }

    public void showStudent() {
        // Access protected variable
        System.out.println("Address (protected): " + address);

        // Access public variable
        System.out.println("Gender (public): " + gender);

        // Access private via getter
        System.out.println("Name (private via getter): " + getName());

        System.out.println("Student ID: " + studentID);
    }
}