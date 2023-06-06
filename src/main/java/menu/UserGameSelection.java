package menu;

import java.util.Scanner;

public class UserGameSelection {

    private static Scanner scanner = new Scanner(System.in);
    private static String userInput = scanner.nextLine();

    public UserGameSelection() {

    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
    public String getUserInput() {
        return userInput;
    }

    public String getUserInputAndSelectGame() {
        boolean isValid = false;

        while(!isValid) {
            switch(userInput) {
                case "1":
                    System.out.println(Messages.ROUTE_CALCULATION + "Planet Mastermind...\n" + RandomStatementSelector.getRandomTakeoffStatement());
                    isValid = true;
                    break;

                case "2":
                    System.out.println(Messages.ROUTE_CALCULATION + "the Terminal orbit...\n" + RandomStatementSelector.getRandomTakeoffStatement());
                    isValid = true;
                    break;

                case "3":
                    System.out.println(Messages.ROUTE_CALCULATION + "the UNO system...\n" + RandomStatementSelector.getRandomTakeoffStatement());
                    isValid = true;
                    break;

                case "4":
                    System.out.println(Messages.ROUTE_CALCULATION + "an adventurous realm...\n" + RandomStatementSelector.getRandomTakeoffStatement());
                    isValid = true;
                    break;

                default:
                    System.out.println(Messages.INVALID_INPUT + "\n");
                    System.out.println(Messages.USER_PROMPT + Messages.GAMES_PRESENTATION);
                    setUserInput(scanner.nextLine());
                    break;
            }
        }
        return getUserInput();
    }

}
