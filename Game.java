package deathnote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Player> players;
    private boolean gameOver;

    public Game() {
        players = new ArrayList<>();
        gameOver = false;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player getPlayerByName(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Death Note game!");

        while (!gameOver) {
            for (Player player : players) {
                if (gameOver) {
                    break;
                }
                player.act(this);
            }
        }

        scanner.close();
    }
}
