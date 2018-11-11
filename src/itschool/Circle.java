package itschool;

public class Circle extends Point {
    float Radius;

    public float getRadius() {
        return Radius;
    }

    public void setRadius(float radius) {
        Radius = radius;
    }

    public Circle(int x, int y, float radius) {
        super(x, y);
        Radius = radius;
    }

    public Circle(float radius) {
        super();
        Radius = radius;
    }

    public Circle(int x, int y) {
        super(x, y);
    }

    public Circle()
    {
        super();
        Radius = 0;
    }

    public void Draw()
    {
        System.out.println("Draw Circle");
    }

}
