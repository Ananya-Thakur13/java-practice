class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();

        // Set values for the properties using setter methods
        person.setName("Ananya Thakur");
        person.setAge(20);
        person.setAddress("123 Main Street");

        // Display the values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}