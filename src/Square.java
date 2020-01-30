public class Square {
    double a = 5;
    double b = 5;

    Square(double a) {
        this.a = a;
        this.b = a;
    }

    double squareArea() {
        double squareArea = a * b;
        return squareArea;
    }

    void showInfo() {
        System.out.println("Pole kwadratu o boku " + a + " = " + squareArea());
    }
}

