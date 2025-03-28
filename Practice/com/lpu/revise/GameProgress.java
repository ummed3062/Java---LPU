package com.lpu.revise;

import java.io.*;

// Step 1: Create a Serializable Player Class
class Player{
    private static final long serialVersionUID = 1L;
    private String name;
    private int score;
    private int level;

    public Player(String name, int score, int level) {
        this.name = name;
        this.score = score;
        this.level = level;
    }

    public void displayProgress() {
        System.out.println("Player: " + name + ", Score: " + score + ", Level: " + level);
    }
}

public class GameProgress {
    private static final String SAVE_FILE = "player_progress.dat";

    // Step 2: Save Player Progress (Serialization)
    public static void saveProgress(Player player) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_FILE))) {
            oos.writeObject(player);
            System.out.println("Game progress saved successfully!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    // Step 3: Load Player Progress (Deserialization)
    public static Player loadProgress() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_FILE))) {
            return (Player) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("No saved progress found. Starting a new game.");
            return null;
        }
    }

    public static void main(String[] args) {
        // Simulating Game Progress
        Player player = new Player("Alice", 1500, 5);
        saveProgress(player);

        // Simulating Game Restart
        Player loadedPlayer = loadProgress();
        if (loadedPlayer != null) {
            loadedPlayer.displayProgress();
        }
    }
}

