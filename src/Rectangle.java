public class Rectangle {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double rectPerimeter() {
        double rectPerimeter = 2 * a + 2 * b;
        return rectPerimeter;
    }

    void showInfo() {
        System.out.println("Obwód prostokąta o bokach " + a + " i " + b + " = " + rectPerimeter());
    }


}
