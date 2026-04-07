package encapsulation;

public class Main {
    public static void main(String[] args) {

        Person p = new Person("John", 20, "Jakarta", "Male");

        // Cannot access private directly
        // p.name = "Mike";  // ERROR

        //  Access via setter
        p.setName("Mike");
        p.setAge(25);

        //  Access via getter
        System.out.println("Name: " + p.getName());

        // Public access
        p.gender = "Male";

        p.displayInfo();

        System.out.println("------------------");

        Student s = new Student("Anna", 19, "Bandung", "Female", "S123");

        s.showStudent();
    }
}