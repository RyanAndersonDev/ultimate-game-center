public class InformalTesting {
    public static void main(String[] args) {
        Game mastermind = new Mastermind();
        mastermind.runGame();
        System.out.println(mastermind.getName());

        Game uno = new Uno();
        uno.runGame();
        System.out.println(uno.getName());

        Game terminalCreator = new TerminalCreator();
        terminalCreator.runGame();
        terminalCreator.getName();

        Game interdimensionalArena = new InterdimensionalArena();
        interdimensionalArena.runGame();
        interdimensionalArena.getName();
    }

}
