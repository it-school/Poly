package itschool;

public class Main {

    public static void main(String[] args) {
	    Point p = new Point();
	    Circle c = new Circle();

	    // Todo Polymorphism
	    // Todo Finish calling of parent's method draw

	    p = c;
	    if(p instanceof Point)
        {
            System.out.println("True!");
            p.Draw();
            Point p1 =  (Point)p; // TODO конструктор копирования для класса Point
            p1.Draw();
        }
    }
}
