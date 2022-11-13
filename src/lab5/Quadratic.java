package lab5;

public class Quadratic extends Root{

    private final double a;
    private final double b;
    private final double c;


    Quadratic(){
        this.a = 1;
        this.b = 0;
        this.c = 0;

        roots = new double[2];
    }

    Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        roots = new double[2];
    }

    int check_roots() {

        double D = b * b - 4 * a * c;
        if (D < 0) {
            return 0;
        }

        if (D == 0) {
            return 1;

        }

        return 2;

    }

    void find_roots() {
        if (this.check_roots() != 0 )
         {
            double sqrt_D = Math.sqrt(b * b - 4 * a * c);
            double x1 = (-1 * b + sqrt_D) / 2 * a;
            double x2 = (-1 * b - sqrt_D) / 2 * a;
            roots[0] = x1;
            roots[1] = x2;
        }

    }

    String stringify() {
        return "roots:\n" + roots[0] + ", " + roots[1];
    }



}
