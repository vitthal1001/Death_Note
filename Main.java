package deathnote;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean replay = true;

        while (replay) {
            DeathNoteGame game = new DeathNoteGame();
            game.play();

            System.out.println("Do you want to replay? (yes/no): ");
            String replayChoice = scanner.nextLine().trim().toLowerCase();

            replay = replayChoice.equals("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
