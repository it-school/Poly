package itschool;

public class Point {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
        return "( "+ x +"; " + y+")";
    }

    public void Draw()
    {
        System.out.println("Draw Point");
    }

}
