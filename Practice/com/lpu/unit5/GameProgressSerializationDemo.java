package com.lpu.unit5;


import java.io.*;

class Player implements Serializable{

    private String name;
    private int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
    public  void display(){
        System.out.println("Player: "+ name);
        System.out.println("Score: "+ score);
    }
}



public class GameProgressSerializationDemo {

    private static final String GAME_PROGRESS_FILE = "player_progress.dat";

    public static void saveProgress(Player player){

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(GAME_PROGRESS_FILE))) {

            oos.writeObject(player);
            System.out.println("Game progress saved successfully");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static Player loadProgress(){
        try(ObjectInputStream objInpStr = new ObjectInputStream(new FileInputStream(GAME_PROGRESS_FILE))) {
            return (Player) objInpStr.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
           return null;
        }
    }

    public static void main(String[] args) {

        Player player = new Player("Ayush", 120);
        Player player1 = new Player("Ansh", 100);

        saveProgress(player);


        Player loadPlayerProgress = loadProgress();
        if(loadPlayerProgress != null){

            loadPlayerProgress.display();
        }


    }



}
