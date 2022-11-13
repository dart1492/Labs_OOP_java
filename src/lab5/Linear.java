package lab5;

public class Linear extends Root {

    private final double k;
    private final double b;

    public Linear() {
        roots = new double[1];
        k = 1;
        b = 1;
    }

    public Linear(double k, double b) {
        this.k = k;
        this.b = b;
        roots = new double[1];
    }

    public int check_roots() {
        if (k == 0 && b != 0) {
            return 0;
        }
        else if (k != 0) {
            return 1;
        }

        return -1;
    }

    public void find_roots() {
        if (check_roots() == 1) {
            roots[0] = (this.b / this.k / 1.0);
            return;
        }

        System.out.println("Wrong number of roots (0 or inf)...");
    }

    public String stringify() {
        return "roots:\n" + roots[0];
    }
}
