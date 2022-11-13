package lab3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //test_custom_class();
         test_Time_class();
        //test_Bill_class();S

    }

    public static void test_Time_class(){
        Scanner scan = new Scanner(System.in);

        String time = scan.nextLine();
        Time first = new Time(time); // testing String constructor
        System.out.println(first.toString() + " String constructor test");

        Time second = new Time(first);
        System.out.println(second.toString() + " Copy constructor test"); // testing Test copy constructor

        Time third = new Time(23,59,59);
        System.out.println(third.toString()); // testing 3 int constructor

        System.out.println(first.toString() + "-" + third.toString() + "=" + first.time_dif(third));
        System.out.println(first.get_all_seconds() + " first in seconds");
        System.out.println(first.get_all_minutes() + " first in minutes");
    }

    public static void test_Bill_class(){
        Time start = new Time("11:54:31");
        Time end = new Time("13:11:5");

        Bill first = new Bill("Harry", "+38096785949", start, end);
        System.out.println("Start time:" + start.toString());
        System.out.println("End time:" + end.toString());
        first.print_bill();
        System.out.println();


        start = new Time("16:00:00");
        end = new Time("15:00:00");

        first = new Bill("Harry", "+38096785949", start, end);
        System.out.println("Start time:" + start.toString());
        System.out.println("End time:" + end.toString());
        first.print_bill();
    }

    public static void test_custom_class(){
        Time first = new Time("11:54:31");
        Time second = new Time("13:11:5");

        // System.out.println(first.time_add(second).toString());
        System.out.println(first.time_add(second).toString());
    }

}
