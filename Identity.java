package deathnote;

public class Identity {
    private boolean isKira;
    private String name;
    private boolean isAlive;

    public Identity(boolean isKira, String name) {
        this.isKira = isKira;
        this.name = name;
        this.isAlive = true;
    }

    public boolean isKira() {
        return isKira;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
