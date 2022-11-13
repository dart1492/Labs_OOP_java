package lab5;

public abstract class Root {

    protected double[] roots;

    abstract int check_roots();

    abstract void find_roots();

    abstract String stringify();

    void GetInfo(){
        this.find_roots();
        System.out.println(this.stringify());
    }

}
