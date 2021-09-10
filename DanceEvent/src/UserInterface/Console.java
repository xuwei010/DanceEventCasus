package UserInterface;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        boolean showMenu = true;
        while (showMenu) {

            int selection = 0;
            try {
                selection = mainMenu();
            } catch (Exception ex) {
                System.out.println("!! Use a number to choose a menu option please.");
            }

            switch (selection) {
                case 1:
                    System.out.println("test item 1");
                    break;
                case 2:
                    // Perform "encrypt number" case.
                    break;
                case 3:
                    // Perform "decrypt number" case.
                    break;
                case 4:
                    // Perform "quit" case.
                    break;
                case 5:
                    // Perform "quit" case.
                    break;
                case 6:
                    // Quit CLI
                    showMenu = false;
                    break;
                default:

            }
        }
    }

    private static int mainMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose action:");
        System.out.println("1) - Show set info");
        System.out.println("2) - Review set");
        System.out.println("3) - Select and update set");
        System.out.println("4) - Read set reviews");
        System.out.println("5) - Add set");
        System.out.println("6) - Quit");

        return input.nextInt();
    }
}
