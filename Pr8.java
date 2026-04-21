class Point {
    int x, y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class Pr8 {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(10, 20);
        Point p3 = new Point(p2);

        p1.display();
        p2.display();
        p3.display();
    }
}

/*
Output:
Point: (5, 5)
Point: (10, 20)
Point: (10, 20)
*/
