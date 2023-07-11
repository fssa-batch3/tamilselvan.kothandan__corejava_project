package day02.solved;

public class Person2 {
    private String name;  // Private data member

    public String getName() {  // Public getter method
        return name;
    }

    public void setName(String Newname) {  // Public setter method
        name = Newname; // Use "this" keyword to refer to the current instance's name variable
    }


// Usage

    public static void main(String[] args) {
        Person2 person = new Person2();
        person.setName("John");      // Setting the name using the setter method
        String name = person.getName();  // Accessing the name using the getter method
        System.out.println(name);    // Output: John
    
}
}
