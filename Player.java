package deathnote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private List<Identity> identities;
    private boolean alive;

    public Player(String name) {
        this.name = name;
        this.identities = new ArrayList<>();
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public void addIdentity(Identity identity) {
        identities.add(identity);
    }

    public List<Identity> getIdentities() {
        return identities;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void act(Game game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It's " + name + "'s turn.");
        System.out.println("Choose an action:");
        System.out.println("1. Investigate");
        System.out.println("2. Accuse");
        System.out.println("3. Use Death Note");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                investigate(game);
                break;
            case 2:
                accuse(game);
                break;
            case 3:
                useDeathNote(game);
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                break;
        }
    }

    private void investigate(Game game) {
        System.out.println("Choose a player to investigate:");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        Player targetPlayer = game.getPlayerByName(playerName);
        if (targetPlayer != null) {
            // Perform investigation logic
            System.out.println("Investigation results for " + targetPlayer.getName() + ":");
            // Print relevant information about the player
        } else {
            System.out.println("Player not found.");
        }
    }

    private void accuse(Game game) {
        System.out.println("Enter player name to accuse:");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        Player accusedPlayer = game.getPlayerByName(playerName);
        if (accusedPlayer != null) {
            // Perform accusation logic
            System.out.println("Accusation results for " + accusedPlayer.getName() + ":");
            // Print whether the player is Kira or not
        } else {
            System.out.println("Player not found.");
        }
    }

    private void useDeathNote(Game game) {
        System.out.println("Enter player name to use Death Note on:");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        Player targetPlayer = game.getPlayerByName(playerName);
        if (targetPlayer != null) {
            // Perform Death Note usage logic
            System.out.println("Using Death Note on " + targetPlayer.getName() + ":");
            // Print whether the target was eliminated or not
        } else {
            System.out.println("Player not found.");
        }
    }
}
