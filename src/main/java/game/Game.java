package game;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class Game {
//variables
    private String name;
    private int numberOfPlayers;
    private ArrayList<User> userArrayList = new ArrayList<>();

//getters
    public String getName() {
        return name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }


    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

//methods
    public void addUser(User newUser){
        userArrayList.add(newUser);
    }

    public String userNamePrompt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 enter your name");
        String userName = input.nextLine();
        User newUser = new User(userName);
        addUser(newUser);
        return userName;
    }

    public String userNamePrompt(int playerNum){
        String userName = "";
        for (int i = 0; i < playerNum; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Player " + (playerNum + 1) + " enter your name");
            userName = input.nextLine();
            User newUser = new User(userName);
            addUser(newUser);
        }
        return userName;
    }

    public void multiUserNamePrompt(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many players will you have?");
        int numberOfPlayersInput = Integer.parseInt(input.nextLine());
        setNumberOfPlayers(numberOfPlayersInput);
        userNamePrompt(getNumberOfPlayers());
    }

//required methods
    public abstract void runGame();
}
