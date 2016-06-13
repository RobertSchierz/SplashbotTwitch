import bot.SplashBot;
import org.jibble.pircbot.IrcException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        // Now start our bot up.
        SplashBot bot = new SplashBot();

        // Enable debugging output.
        bot.setVerbose(true);
        bot.connectToChannel();

        bot.send("hallo welt!");
    }
}
