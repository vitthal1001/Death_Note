package deathnote;

import java.util.Scanner;

public class UseDeathNoteAction extends Action {
    public UseDeathNoteAction(Player player) {
        super(player);
    }

    @Override
    public void execute(Game game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name to use death note on:");
        String playerName = scanner.nextLine();

        Player targetedPlayer = game.getPlayerByName(playerName);
        if (targetedPlayer != null) {
            if (targetedPlayer.getIdentities().size() == 1 && targetedPlayer.getIdentities().get(0).isKira()) {
                System.out.println("Congratulations, " + getPlayer().getName() + ". You have successfully killed " + targetedPlayer.getName());
                targetedPlayer.getIdentities().get(0).setAlive(false);
            } else {
                System.out.println("You can only use the death note on a player who is Kira and has no other identities.");
            }
        } else {
            System.out.println("Player not found.");
        }
        scanner.close(); // Close the scanner after its usage
    }
}
