package bot;

import grammarfiles.CommandControll;
import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.PircBot;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Jan on 07.06.2016.
 */
public class SplashBot extends PircBot {


    CommandControll controllgrammar = new CommandControll();

    public String channel = "#splshbot";
    //public String channel = "#splshbot";
    public String auth = "oauth:bat48hhqj1bebsju7eigtxbvxcw2p8";

    private Long startTimeMillis;

    public SplashBot() {
        this.setName("splshbot");
        this.isConnected();
    }

    @Override
    protected void onMessage(String channel, String sender, String login, String hostname, String message) {
        System.out.println(sender + ": " + message);
        checkMessage(message);
    }

    public void checkMessage(String message){
       /* if (message.equalsIgnoreCase("!test")){
            send(":D");
        }
        if (message.equalsIgnoreCase("!uptime")){
            getUptime();
        }*/
        if(controllgrammar.getCommandList().containsKey(message)){
            send(controllgrammar.getCommandList().get(message).toString());

        }else if(controllgrammar.getMethodist().containsKey(message)){
            try {
                callMethods(controllgrammar.getMethodist().get(message).toString());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Connect to the IRC server and saves the current time for the 'uptime' command.
     */
    public void connectToChannel() {
        try {
            this.connect("irc.twitch.tv", 80, auth);
            this.joinChannel(channel);
        } catch (IOException | IrcException e) {
            e.printStackTrace();
        }

        //save current time for 'uptime' command
        if (this.isConnected()){
            startTimeMillis = System.currentTimeMillis();
        }
    }

    public void send(String message){
        this.sendMessage(channel, message);
    }

    private void getUptime(){
        Long uptimeMillis = System.currentTimeMillis();

        Long elapsedTime = uptimeMillis - startTimeMillis;

        long timeInSeconds = elapsedTime / 1000;
        long hours, minutes, seconds;
        hours = timeInSeconds / 3600;
        timeInSeconds = timeInSeconds - (hours * 3600);
        minutes = timeInSeconds / 60;
        timeInSeconds = timeInSeconds - (minutes * 60);
        seconds = timeInSeconds;

        String diffTime =
                (hours<10 ? "0" + hours : hours) + " h "
                + (minutes < 10 ? "0" + minutes : minutes) + " min "
                + (seconds < 10 ? "0" + seconds : seconds) + " sec";


        send(diffTime);

        //String uptime = startTimeMillis.toString();
        //SimpleDateFormat sdf = new SimpleDateFormat("dd:hh:mm:ss");
        //Date resultdate = new Date(elapsedTime);
        //System.out.println("Startzeit: " + sdf.format(new Date(startTimeMillis)));
        //System.out.println(sdf.format(new Date(uptimeMillis)));
        //send(sdf.format(resultdate));
    }

    public boolean checkGrammar() throws IOException {
        controllgrammar.checkCommand();
        return controllgrammar.checkError();
    }

    public void callMethods(String command) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

            Commandmethods methods = new Commandmethods();
            Class methodClass = methods.getClass();

            Method method1 = methodClass.getMethod(command, new Class[]{});
            method1.invoke(methods, new Object[]{});

    }
}
