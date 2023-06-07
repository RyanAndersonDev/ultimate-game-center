package menu;

import game.*;

import java.util.Scanner;

public class UserGameSelection {

    private static Scanner scanner = new Scanner(System.in);
    private static String userInput = scanner.nextLine();

    public UserGameSelection() {

    }

    private void setUserInput(String userInput) {
        this.userInput = userInput;
    }
    private String getUserInput() {
        return userInput;
    }

    public Game getUserInputAndSelectGame() {
        boolean isValid = false;

        while(!isValid) {
            switch(userInput) {
                case "1":
                    System.out.println(Messages.ROUTE_CALCULATION + "Planet Mastermind...\n" + RandomStatementSelector.getRandomTakeoffStatement());
                    isValid = true;
                    if(isValid) {
                        Mastermind game = new Mastermind();
                        return game;
                    }
                    break;

                case "2":
                    System.out.println(Messages.ROUTE_CALCULATION + "the Terminal orbit...\n" + RandomStatementSelector.getRandomTakeoffStatement());
                    isValid = true;
                    if(isValid) {
                        TerminalCreator game = new TerminalCreator();
                        return game;
                    }

                    break;

                case "3":
                    System.out.println(Messages.ROUTE_CALCULATION + "the UNO system...\n" + RandomStatementSelector.getRandomTakeoffStatement());
                    isValid = true;
                    if(isValid) {
                        Uno game = new Uno();
                        return game;
                    }
                    break;

                case "4":
                    System.out.println(Messages.ROUTE_CALCULATION + "an adventurous realm...\n" + RandomStatementSelector.getRandomTakeoffStatement());
                    isValid = true;
                    if(isValid) {
                        InterdimensionalArena game = new InterdimensionalArena();
                        return game;
                    }
                    break;

                default:
                    System.out.println(Messages.INVALID_INPUT + "\n" + Messages.USER_PROMPT + Messages.GAMES_PRESENTATION);
                    setUserInput(scanner.nextLine());
                    break;
            }
        }
        return null;
    }

}
