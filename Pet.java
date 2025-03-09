// Aiden Thomas
// 1/28/25
// This program is the blueprint for Pet objects

public class Pet {

    // private data fields
    private String name;
    private String type;
    private int age;

    // public Constructor(s)
    public Pet() {
        this.name = "Pet Name";
        this.type = "Animal";
        this.age = 1;
    }

    public Pet(String type, String name, int age) {
        this.setType(type);
        this.setName(name);
        this.setAge(age);
    }

    // public set or mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 1; // making sure it is not less
        }
    }

    // public get or accessor methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    // public custom method for inputs
    public String speak() {
        if (type.equalsIgnoreCase("Dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("Cat")) {
            return "Meow";
        } else {
            return "Noise";
        }
    }

    // public toString method
    public String toString() {
        String output = "Pet information:\n";
        output += "Type: " + type + "\n";
        output += "Name: " + name + "\n";
        output += "Sound: " + speak() + "\n";
        output += "Age: " + age + "\n";
        return output;
    }
}
