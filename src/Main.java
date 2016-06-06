import bot.SplashBot;
import org.jibble.pircbot.IrcException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Now start our bot up.
        SplashBot bot = new SplashBot();

        // Enable debugging output.
        bot.setVerbose(true);

        // Connect to the IRC server.
        try {
            bot.connect("irc.freenode.net");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IrcException e) {
            e.printStackTrace();
        }

        // Join the #pircbot channel.
        bot.joinChannel("#pircbot");
    }
}
