public class Triangle {
    double a, b, c;


    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double circTriangle() {

        double circTriangle = a + b + c;
        return circTriangle;
    }

    void showInfo() {
        System.out.println("Obwód trójkąta o bokach " + a + ", " + b + ", " + c + " = " + circTriangle());
    }
}
