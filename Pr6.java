class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Pr6 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 3);

        System.out.println("Rectangle 1 Area: " + r1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + r1.getPerimeter());

        System.out.println("Rectangle 2 Area: " + r2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + r2.getPerimeter());
    }
}

/*
Output:
Rectangle 1 Area: 1.0
Rectangle 1 Perimeter: 4.0
Rectangle 2 Area: 15.0
Rectangle 2 Perimeter: 16.0
*/
