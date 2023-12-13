
import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome, You have adopted a virtual pet! Lets Play with your personal virtual pet!");
        System.out.println("You have adopted a new puppy let's begin");

        System.out.println("What would you like to name your pet?");
        String name = input.nextLine();

        VirtualPet pet = new VirtualPet(name);
        System.out.println("Oh, " + pet.getName() + " is great name!");
        System.out.println("Congrats on adopting your new pet \n" + name + "!");
        System.out.println("Lets interact with your pet, Please Enter Yes or No to start.");
        String decision = input.nextLine();

        while (decision.equalsIgnoreCase("Yes")) {
            System.out.println("This is the status of your Pet: \n");

            System.out.println("Name\t|Hunger\t|Thirst\t|Boredom\t");// the \t allows console to align output in columns
            System.out.println("--------|-------|-------|-------");
            System.out.println();
            System.out.println(
                    pet.getName() + "   " + pet.getHunger() + "   " + pet.getThirst() + "   " + pet.getBoredom());
            System.out.println("\nWhat would you like to do next?\n");

            System.out.println("1. Feed your pet");
            System.out.println("2. Water your pet");
            System.out.println("3. Play with your pet");
            System.out.println("4. Quit");
            pet.petIsBored();
            pet.petIsHungry();
            pet.petIsThirsty();

            String optionEntered = input.nextLine();

            if (optionEntered.equals("1")) { // OPTION 1
                pet.fedPet();
                System.out.println("You fed your pet.\n");

            } else if (optionEntered.equals("2")) { // OPTION 2
                pet.waterPet();
                System.out.println("You gave your water.\n");

            } else if (optionEntered.equals("3")) { // OPTION 3
                pet.playPet();
                System.out.println("You took " + name + " for a walk to the field to play.\n");

            } else if (optionEntered.equals("4")) { // OPTION 6
                System.out.println("Are you sure you wish to quit the game?");
                System.out.println("Enter Yes or No");
                String decision2 = input.nextLine();

                if (decision2.equalsIgnoreCase("Yes")) {
                    System.out.println("You have quit the game...");
                    System.exit(0);

                } else {
                    decision2.equalsIgnoreCase("No");
                    System.out.println("Glad you are still with us.");
                    System.out.println("Your pet will be pleased that you stayed for a little while longer.\n");
                }

            }
            pet.tick();
        } // end while loop

        input.close();
    }

}
