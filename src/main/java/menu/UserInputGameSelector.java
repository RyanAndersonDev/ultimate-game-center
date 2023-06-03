package menu;

import java.util.Scanner;

public class UserInputGameSelector {

    private static Scanner scanner = new Scanner(System.in);

    public UserInputGameSelector() {

    }

    public String getUserInputAndSelectGame() {
        System.out.println(WelcomeMessages.USER_PROMPT + WelcomeMessages.GAMES_PRESENTATION);
        if(!validateInput()) {
            validateInput();
        }
        return this.getUserInput();
    }

    private String getUserInput() {
        return scanner.nextLine();
    }

    private boolean validateInput() {
        boolean isValid = false;
        String currentInput = this.getUserInput();

        while(!isValid) {
            switch(currentInput) {
                case "1":
                    System.out.println("\nCalculating route to Planet Mastermind...\n" + RandomStatementSelector.getRandomTakeoffStatement() + "\n");
                    isValid = true;
                    break;
//                    return "Mastermind";
                case "2":
                    System.out.println("\nCalculating route to the Terminal orbit...\n" + RandomStatementSelector.getRandomTakeoffStatement() + "\n");
                    isValid = true;
                    break;
//                    return "Terminal Creator";
                case "3":
                    System.out.println("\nCalculating route to the UNO system...\n" + RandomStatementSelector.getRandomTakeoffStatement() + "\n");
                    isValid = true;
                    break;
//                    return "UNO";
                case "4":
                    System.out.println("\nCalculating route to an adventurous realm...\n" + RandomStatementSelector.getRandomTakeoffStatement() + "\n");
                    isValid = true;
                    break;
//                    return "Interdimensional Arena";
                default:
                    System.out.println(WelcomeMessages.INVALID_INPUT);
                    getUserInputAndSelectGame();
            }
        }
        return isValid;
    }

}
