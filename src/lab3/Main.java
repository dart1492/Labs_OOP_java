package lab3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //test_custom_class();
        //test_Time_class();
        test_Bill_class();

    }

    public static void test_Time_class(){
        Scanner scan = new Scanner(System.in);

        String time = scan.nextLine();
        Time first = new Time(time); // testing String constructor
        System.out.println(first.toString());

        Time second = new Time(first);
        System.out.println(second.toString()); // testing Test copy constructor

        Time third = new Time(23,59,59);
        System.out.println(third.toString()); // testing 3 int constructor

        System.out.println(first.time_add(third));
        System.out.println(first.get_all_seconds());
        System.out.println(first.get_all_minutes());
    }

    public static void test_Bill_class(){
        Time start = new Time("23:23:40");
        Time end = new Time("16:10:9");

        Bill first = new Bill("Harry", "+38096785949", start, end);
        first.print_bill();
        System.out.println();


        start = new Time("16:00:00");
        end = new Time("15:00:00");

        first = new Bill("Harry", "+38096785949", start, end);
        first.print_bill();
    }

    public static void test_custom_class(){
        Time first = new Time("11:50:1");
        Time second = new Time("15:55:1");

        // System.out.println(first.time_add(second).toString());
        System.out.println(first.time_dif(second).toString());
    }

}
