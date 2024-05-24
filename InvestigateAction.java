package deathnote;

public class InvestigateAction extends Action {
    public InvestigateAction(Player player) {
        super(player);
    }

    @Override
    public void execute(Game game) {
        Player currentPlayer = getPlayer();
        for (Player player : game.getPlayers()) {
            if (player != currentPlayer) {
                for (Identity identity : player.getIdentities()) {
                    System.out.println(player.getName() + " has identity " + identity.getName());
                }
            }
        }
    }
}
