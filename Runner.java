// Aiden Thomas
// 2/9/25
// This program tests the Pet class

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        // Creates a Pet object using the default constructor
        Pet myPet1 = new Pet();
        System.out.println(myPet1);

        // Creates a Pet object using the custom constructor
        Pet myPet2 = new Pet("Dog", "Buster", 11);
        System.out.println("\n" + myPet2);

        // Taking user input for a new pet
        Scanner scanner = new Scanner(System.in);

        // Prompting for pet type, name, and age
        System.out.println("Enter animal type:");
        String type = scanner.nextLine();

        System.out.println("Enter animal name:");
        String name = scanner.nextLine();

        System.out.println("Enter animal age:");
        int age = scanner.nextInt();

        // Creates a Pet object based on user input
        Pet myPet3 = new Pet(type, name, age);
        System.out.println("\n" + myPet3);

        scanner.close();  // Closing the scanner to avoid resource leak
    }
}
