class Volume {
    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Pr12 {
    public static void main(String[] args) {
        Volume v = new Volume();

        double cube = v.calculateVolume(3);
        double rectangular = v.calculateVolume(4, 5, 6);
        double sphere = v.calculateVolume(2.5f);

        System.out.println("Cube Volume: " + cube);
        System.out.println("Rectangular Cube Volume: " + rectangular);
        System.out.println("Sphere Volume: " + sphere);
    }
}

/*
Output:
Cube Volume: 27.0
Rectangular Cube Volume: 120.0
Sphere Volume: 65.44984694978736
*/
