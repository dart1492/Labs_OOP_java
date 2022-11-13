package lab4;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Lab 4");
        Rectangle first = new Rectangle(4,5);
        first.view();


        Pyramid second = new Pyramid(5,6,7);
        second.view();
        System.out.println(second.area());
    }
}
