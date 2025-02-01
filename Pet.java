public class Pet {

    // private data fields - declaration only - no initialization
    private String name;

    // public Constructor(s) - have no return type - differ by input params - init your data fields here
    public Pet() {
        this.name = "Pet Name";
    }

    // public set or mutator methods - return type void
    public void setName(String name) {
        this.name = name;
    }

    // public get or accessor method - return type - matches data field data type
    public String getName() {
        return name;
    }

    // public toString method - return type String
    public String toString() {
        String output = "Pet Information: ";
        output += ("\n" + name);
        return output;
    }

    //main
    public static void main(String[] args) {
        //Displays information for pet 1
        Pet myPet1 = new Pet();
        System.out.println(myPet1);

        //Displays information for pet 2
        Pet myPet2 = new Pet();
        myPet2.setName("Buster");
        System.out.println("\n" + myPet2);
    }
}
