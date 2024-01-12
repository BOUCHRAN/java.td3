public class Point {
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}