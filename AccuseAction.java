package deathnote;

import java.util.Scanner;

public class AccuseAction extends Action {
    public AccuseAction(Player player) {
        super(player);
    }

    @Override
    public void execute(Game game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name to accuse:");
        String playerName = scanner.nextLine();

        Player accusedPlayer = game.getPlayerByName(playerName);
        if (accusedPlayer != null) {
            if (accusedPlayer.getIdentities().size() == 1 && accusedPlayer.getIdentities().get(0).isKira()) {
                System.out.println("Congratulations, " + getPlayer().getName() + "! You have won the game!");
                game.setGameOver(true);
            } else {
                System.out.println("Sorry, " + getPlayer().getName() + ", " + accusedPlayer.getName() + " is not Kira.");
            }
        } else {
            System.out.println("Sorry, player " + playerName + " not found.");
        }
        scanner.close();
    }
}
