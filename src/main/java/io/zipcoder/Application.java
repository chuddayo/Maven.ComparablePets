package io.zipcoder;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int numPets;

        // Asks user how many pets they have
        System.out.println("How many pets do you have?");
        Scanner in = new Scanner(System.in);
        numPets = in.nextInt();
        Pet[] userPets = new Pet[numPets];
        // They pick what type and set a name
        for (int i = 0; i < numPets; i++) {
            System.out.println("What is pet #" + (i+1) +"'s type? (Bird, Cat, or Dog)");
            String petType = in.next().toLowerCase();
            String petName;
            switch (petType) {
                case "bird":
                    System.out.println("What is your bird's name?");
                    petName = in.next();
                    userPets[i] = new Bird(petName);
                    break;
                case "cat":
                    System.out.println("What is your cat's name?");
                    petName = in.next();
                    userPets[i] = new Cat(petName);
                    break;
                case "dog":
                    System.out.println("What is your dog's name?");
                    petName = in.next();
                    userPets[i] = new Dog(petName);
                    break;
                default:
                    i--;
                    break;
            }

        }
        // Outputs string rep of all the pets
        for (Pet pet : userPets) System.out.print(pet);
    }
}
