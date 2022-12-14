import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Calling method to create first character
        Character character1 = createFirstCharacter();
        //Calling method to create second character
        Character character2 = createSecondCharacter();
        //Calling method to initiate battle game between character1 and character2
        battle(character1, character2);
    }

    private static Character createFirstCharacter() {
        System.out.println("╱╭╮╱╱╱╱╭╮╭━━╮╭━━━┳━━━━┳━━━━┳╮╱╱╭━━━╮╭━━━┳━━━┳━╮╭━┳━━━╮");
        System.out.println("╭╯┃╱╱╱╭╯┃┃╭╮┃┃╭━╮┃╭╮╭╮┃╭╮╭╮┃┃╱╱┃╭━━╯┃╭━╮┃╭━╮┃┃╰╯┃┃╭━━╯");
        System.out.println("╰╮┃╭╮╭╋╮┃┃╰╯╰┫┃╱┃┣╯┃┃╰┻╯┃┃╰┫┃╱╱┃╰━━╮┃┃╱╰┫┃╱┃┃╭╮╭╮┃╰━━╮");
        System.out.println("╱┃┃╰╋╋╯┃┃┃╭━╮┃╰━╯┃╱┃┃╱╱╱┃┃╱┃┃╱╭┫╭━━╯┃┃╭━┫╰━╯┃┃┃┃┃┃╭━━╯");
        System.out.println("╭╯╰┳╋╋┳╯╰┫╰━╯┃╭━╮┃╱┃┃╱╱╱┃┃╱┃╰━╯┃╰━━╮┃╰┻━┃╭━╮┃┃┃┃┃┃╰━━╮");
        System.out.println("╰━━┻╯╰┻━━┻━━━┻╯╱╰╯╱╰╯╱╱╱╰╯╱╰━━━┻━━━╯╰━━━┻╯╱╰┻╯╰╯╰┻━━━╯");
        System.out.println(blue + "Welcome to 1x1 Battle Game!" + "\n" + "To start a new battle you have to choose the type and name of both Characters!" + reset + "\n");

        Scanner sc = new Scanner((System.in));
        Character character1 = null;
        System.out.println("First create the Character 1!");
        System.out.println("-------------------------");
        System.out.println("Character types available:");
        System.out.println(green + "[1] -> Warrior");
        System.out.println("[2] -> Wizard" + reset);
        System.out.println("\u001B[31m" + "[3] -> Exit Game" + "\u001B[31m" + reset);
        System.out.println();
        System.out.println(red + "Choose the Character type by entering 1 or 2: " + reset);

        int options1 = 1;

        while (options1 != 0) {
            options1 = sc.nextInt();
            switch (options1) {
                case 1: {

                    System.out.println("You have chosen a warrior as character 1");
                    System.out.println("---------------");
                    System.out.println(red + "Give this warrior a name:" + reset);

                    String newName = sc.next();
                    int newHp = new Random().nextInt(101) + 100;
                    int newStamina = new Random().nextInt(41) + 10;
                    int newStrength = new Random().nextInt(10) + 1;
                    character1 = new Warrior(newName, newHp, newStamina, newStrength);
                    options1 = 0;
                    return character1;
                }
                case 2: {

                    System.out.println("You have chosen the a wizard as character 1 ");
                    System.out.println("---------------");
                    System.out.println(red + "Give this wizard a name:" + reset);

                    String newName = sc.next();
                    int newHp = new Random().nextInt(51) + 50;
                    int newMana = new Random().nextInt(41) + 10;
                    int newIntelligence = new Random().nextInt(50) + 1;
                    character1 = new Wizard(newName, newHp, newMana, newIntelligence);
                    options1 = 0;
                    return character1;
                }
                case 3: {
                    System.out.println("\n" + blue + "GOODBYE!" + reset);
                    System.out.println("---------------");
                    System.exit(1);
                }
                default: {
                    System.err.println("Select a correct Character type. Choose again.");
                    break;
                }
            }
        }
        return character1;
    }

    private static Character createSecondCharacter() {
        Scanner sc = new Scanner((System.in));
        Character character2 = null;
        System.out.println("---------------");
        System.out.println("Now create the second character!");
        System.out.println("---------------");
        System.out.println("Character types available:");
        System.out.println(green + "[1] -> Warrior");
        System.out.println("[2] -> Wizard" + reset);
        System.out.println("\u001B[31m" + "[3] -> Exit Game" + "\u001B[31m" + reset);
        System.out.println();

        System.out.println(red + "Choose the Character type by entering 1 or 2:" + reset);

        int options2 = 1;

        while (options2 != 0) {
            options2 = sc.nextInt();
            switch (options2) {
                case 1: {

                    System.out.println(green + "You have chosen a warrior as character 2" + reset);
                    System.out.println("---------------");
                    System.out.println(red + "Give this warrior a name:" + reset);

                    String newName = sc.next();
                    int newHp = new Random().nextInt(101) + 100;
                    int newStamina = new Random().nextInt(41) + 10;
                    int newStrength = new Random().nextInt(10) + 1;
                    character2 = new Warrior(newName, newHp, newStamina, newStrength);
                    options2 = 0;
                    return character2;

                }
                case 2: {

                    System.out.println(green + "You have chosen a wizard as character 2" + reset);
                    System.out.println("---------------");
                    System.out.println(red + "Give this wizard a name:" + reset);

                    String newName = sc.next();
                    int newHp = new Random().nextInt(51) + 50;
                    int newMana = new Random().nextInt(41) + 10;
                    int newIntelligence = new Random().nextInt(50) + 1;
                    character2 = new Wizard(newName, newHp, newMana, newIntelligence);
                    options2 = 0;
                    return character2;
                }
                case 3: {
                    System.out.println("\n" + blue + "GOODBYE!" + reset);
                    System.out.println("---------------");
                    System.exit(1);
                }
                default: {
                    System.err.println("Select a correct Character type. Choose again");
                }
            }
        }
        return character2;
    }

    public static void battle(Character character1, Character character2) throws InterruptedException {
        int counter = 1;
        System.out.println("\n" + blue + "BOTH CHARACTERS SELECTED:" + reset);
        System.out.println(character1);
        System.out.println(character2 + "\n");
        System.out.println("Preparing battle...");
        System.out.println("------------------------" + "\n");
        Thread.sleep(3000);
        do {
            System.out.println(green + "ROUND " + counter + " starts:" + "\n" + reset);
            character1.attack(character2);
            character2.attack(character1);
            System.out.println(red + "Round " + counter + " finalized:" + reset + "\n" + character1 + "\n" + character2 + "\n");
            System.out.println("------------------------" + "\n");
            counter++;
            Thread.sleep(1000);
        } while (character1.isAlive() && character2.isAlive());
        if (character1.isAlive()) {
            System.out.println(green + character1.getName() + " wins!" + reset + "\n");
            System.out.println(red + "Battle finalized: Choose your characters again or exit game" + reset + "\n");
            System.out.println("...resetting game..." + "\n");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(3000);
            battle(createFirstCharacter(), createSecondCharacter());
        } else if (character2.isAlive()) {
            System.out.println(green + character2.getName() + " wins!" + reset + "\n");
            System.out.println(red + "Battle finalized: Choose your characters again or exit game" + reset + "\n");
            System.out.println("...resetting game..." + "\n");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(3000);
            battle(createFirstCharacter(), createSecondCharacter());
        } else {
            System.out.println(red + "There was a Draw!" + reset + "\n");
            System.out.println(red + "Battle finalized: Choose your characters again or exit game" + reset + "\n");
            System.out.println("...resetting game..." + "\n");
            System.out.println("----------------------------------------------------------------------------");
            Thread.sleep(3000);
            battle(createFirstCharacter(), createSecondCharacter());
        }
    }

    //Setting up some colors for the output:
    public static final String red = "\u001B[41m"; //background in red
    public static final String reset = "\033[0m"; //reset color patterns
    public static final String green = "\u001B[32m"; //green text
    public static final String blue = "\u001B[34m"; //blue text
}