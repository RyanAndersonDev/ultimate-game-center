public class Mastermind extends Game{
//variables
    private final String NAME = "Mastermind";

//constructor
    public Mastermind(){
        setName(NAME);
    }

//Methods
    public void runGame(){ //The Run Game will be the main method for Mastermind
        userNamePrompt(2);
        System.out.println("Mastermind is running!"); //placeholder test for running from menu
    }
}
