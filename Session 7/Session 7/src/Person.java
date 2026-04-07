package encapsulation;

public class Person{

    private String name;
    private int age;

    protected String address;

    public String gender;

    public Person(String name, int age,String address, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    //Getter 
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
    }


}