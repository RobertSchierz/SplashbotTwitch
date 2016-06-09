import bot.SplashBot;
import org.jibble.pircbot.IrcException;

import java.io.IOException;

public class Main {

    public static String channel = "#robdebang";
    public static String auth = "oauth:bat48hhqj1bebsju7eigtxbvxcw2p8";

    public static void main(String[] args) {


        // Now start our bot up.
        SplashBot bot = new SplashBot();

        // Enable debugging output.
        bot.setVerbose(true);

        // Connect to the IRC server.
        try {
            bot.connect("irc.twitch.tv", 80, auth);
            //bot.connect("irc.twitch.tv", 6667, g_bot_oauth);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IrcException e) {
            e.printStackTrace();
        }

        // Join the #pircbot channel.
        bot.joinChannel(channel);
        bot.getName();

        bot.sendMessage(channel, "hallo welt!");

        bot.sendMessage(channel, "schwanz");

        bot.sendMessage(channel, "crunch'a'tize me capt'n");


        //oauth:bat48hhqj1bebsju7eigtxbvxcw2p8
    }
}
