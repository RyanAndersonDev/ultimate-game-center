package menu;

import java.util.Random;

public class RandomStatementSelector {

    // We can add a randomRouteStatement and getRandomRouteStatement as well to customize random "Calculating route to..." statements as well
    private static final String[] takeoffStatements = new String[] {"BLAST OFF!!!", "Fasten your seatbelts...", "If you have motion sickness during interstellar travel, there's a bag under your seat. Maybe.",
            "All systems go!", "Our ships have a 95% successful launch rate! Good enough, right?", "What did you want to be when you grew up? Hopefully an interstellar traveller!",
            "Hold on to your hats! If you don't have a hat, hold on to your hair. If you don't have hair... just hold on to something."};

    public static String getRandomTakeoffStatement() {
        Random random = new Random();
        int randomNum = random.nextInt(takeoffStatements.length);
        return takeoffStatements[randomNum];
    }

}
