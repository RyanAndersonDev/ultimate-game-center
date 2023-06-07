package game;

import game.Game;

import java.util.Scanner;

public class Uno extends Game {
//variables
    private final String NAME = "game.Uno";

//constructor
    public Uno(){
        setName(NAME);
    }

//Methods
    public void runGame(){ //The Run game.game.Game will be the main method for game.Uno
        Scanner input = new Scanner(System.in);
        System.out.println("How many players will you have?");
        int numberOfPlayersInput = Integer.parseInt(input.nextLine());
        setNumberOfPlayers(numberOfPlayersInput);
        for (int i = 0; i < getNumberOfPlayers(); i++) {
            System.out.println("Player " + (i + 1) + " enter your name");
            String userName = input.nextLine();
            User newUser = new User(userName);
            addUser(newUser);
        }
        System.out.println("game.Uno is running!"); //placeholder test for running from menu
    }


}
