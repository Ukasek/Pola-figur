public class Circle {
    double r;


    Circle(double r) {
        this.r = r;
    }

    double circField() {
        double circField = 3.14 * (2 * r);
        return circField;
    }

    void showInfo() {
        System.out.println("Pole koła o promieniu " + r + " = " + circField());
    }
}