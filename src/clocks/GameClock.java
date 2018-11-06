package clocks;

import game.GM;

import java.util.Timer;
import java.util.TimerTask;

public class GameClock {
    static Timer time = new Timer();

    public static void start(){
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                GM.p.move();

            }
        },15,15);
    }
}
