import bot.SplashBot;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {


    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {




            // Now start our bot up.
            SplashBot bot = new SplashBot();

            if(!bot.checkGrammar()){

                //bot.callMethods();

                // Enable debugging output.
                bot.setVerbose(true);
                bot.connectToChannel();

                bot.send("hallo welt!");
            }else{
                System.out.println("Fehler beim Lesen der Befehle");
            }

    }

}
