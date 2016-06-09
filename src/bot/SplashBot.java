package bot;

import org.jibble.pircbot.PircBot;

/**
 * Created by Jan on 07.06.2016.
 */
public class SplashBot extends PircBot{

    public SplashBot(){
        this.setName("splshbot");
        this.isConnected();
    }

    @Override
    protected void onMessage(String channel, String sender, String login, String hostname, String message) {
        System.out.println(sender + ": " + message);
    }


}
