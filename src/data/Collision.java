package data;

public class Collision {

    public static boolean collideLeft (int x) {
        return (x <= 1);
    }

    public static boolean collideRight(int x, int breite){
        return (x + breite >= 781);
    }
}
