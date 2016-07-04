package bot;

/**
 * Created by Robert on 04.07.2016.
 */
public class Commandmethods extends SplashBot {
    SplashBot bot;
    Commandmethods(SplashBot bot){
       this.bot = bot;
    }

    public void getUptime(){

        Long uptimeMillis = System.currentTimeMillis();

        Long elapsedTime = uptimeMillis - this.bot.startTimeMillis;

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


        this.bot.send(diffTime);

        //String uptime = startTimeMillis.toString();
        //SimpleDateFormat sdf = new SimpleDateFormat("dd:hh:mm:ss");
        //Date resultdate = new Date(elapsedTime);
        //System.out.println("Startzeit: " + sdf.format(new Date(startTimeMillis)));
        //System.out.println(sdf.format(new Date(uptimeMillis)));
        //send(sdf.format(resultdate));

    }
}
