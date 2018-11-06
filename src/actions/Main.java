package actions;

import clocks.GameClock;
import game.GM;
import gui.Gui;

public class Main {

    public static void main(String[] args) {
        Gui g = new Gui();

        GM.setup();
        g.create();
        GameClock.start();
    }
}
