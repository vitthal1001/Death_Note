package deathnote;

public abstract class Action {
    private Player player;

    public Action(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public abstract void execute(Game game);
}

