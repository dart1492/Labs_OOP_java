package lab3;

public class Bill {

    private String surname;
    private String phone_number;
    final static private int price_per_minute = 1;
    private Time call_start_time;
    private Time call_end_time;
    private int total_sum;

    public Bill(String surname, String phone_number, Time start, Time finish) {
        this.surname = surname;
        this.phone_number = phone_number;
        this.call_end_time = finish;
        this.call_start_time = start;
        this.total_sum = price_per_minute * (this.call_end_time.time_dif(this.call_start_time)).get_all_minutes();
    }

    public void print_bill(){
        System.out.println("Caller surname: " + surname);
        System.out.println("Number: " + phone_number);
        System.out.println("You were on line for: " + (call_end_time.time_dif(call_start_time).toString()));
        System.out.println("Total sum:" + total_sum);
    }
}
