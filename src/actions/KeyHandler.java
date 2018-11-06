package actions;

import game.Dir;
import game.GM;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                GM.p.setDir(Dir.LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                GM.p.setDir(Dir.RIGHT);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                if (GM.p.getDir() == Dir.LEFT) GM.p.setDir(Dir.IDLE);
                break;
            case KeyEvent.VK_RIGHT:
                if (GM.p.getDir() == Dir.RIGHT) GM.p.setDir(Dir.IDLE);
                break;
        }
    }
}
