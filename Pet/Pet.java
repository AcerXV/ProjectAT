// Aiden Thomas
// 1/28/25
// This program is the blueprint for Pet objects

public class Pet {

    // private data fields - declaration only - no initialization
    private String name;
    private String type;
    private int age;

    // public Constructor(s) - have no return type - differ by input params - init your data fields here
    public Pet() {
        this.name = "Pet Name";
        this.type = "Animal";
        this.age = 1;
    }

    // Custom Constructor with three input parameters
    public Pet(String name, String type, int age) {
        this.setName(name);
        this.setType(type);
        this.setAge(age);
    }

    // public set or mutator methods - return type void
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        if (age >= 0) { // Ensures age is non-negative
            this.age = age;
        }
    }

    // public get or accessor method - return type - matches data field data type
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return this.age;
    }

    // public custom method - determines what sound the pet makes
    public String speak() {
        if (this.type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (this.type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }

    // public toString method - return type String
    public String toString() {
        String output = "Pet Information: ";
        output += "\nType: " + this.type;
        output += "\nName: " + this.name;
        output += "\nSound: " + this.speak();
        output += "\nAge: " + this.age;
        return output;
    }

    // main method for testing
    public static void main(String[] args) {
        // Displays information for pet 1 (default constructor)
        Pet myPet1 = new Pet();
        System.out.println(myPet1);

        // Displays information for pet 2 (custom constructor)
        Pet myPet2 = new Pet("Buster", "Dog", 11);
        System.out.println("\n" + myPet2);
    }
}
