package deathnote;

import java.util.Scanner;

public class DeathNoteGame {
    public void play() {
        displayRules();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (write, flip, addname, accuse, investigate, usedeathnote, quit): ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("write")) {
                write(scanner);
            } else if (command.equalsIgnoreCase("flip")) {
                flip();
            } else if (command.equalsIgnoreCase("addname")) {
                addName(scanner);
            } else if (command.equalsIgnoreCase("accuse")) {
                accuse(scanner);
            } else if (command.equalsIgnoreCase("investigate")) {
                investigate(scanner);
            } else if (command.equalsIgnoreCase("usedeathnote")) {
                useDeathNote(scanner);
            } else if (command.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid command!");
            }
        }

        scanner.close();
    }

    private void displayRules() {
        // Display game rules
    }

    private void write(Scanner scanner) {
        // Implement write action
    }

    private void flip() {
        // Implement flip action
    }

    private void addName(Scanner scanner) {
        // Implement add name action
    }

    private void accuse(Scanner scanner) {
        // Implement accuse action
    }

    private void investigate(Scanner scanner) {
        // Implement investigate action
    }

    private void useDeathNote(Scanner scanner) {
        // Implement use Death Note action
    }
}
