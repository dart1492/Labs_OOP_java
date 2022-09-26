package lab3;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;


    private int calc_all_seconds (){
       return this.hours * 3600 + this.minutes*60 + this.seconds;
    }

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;

    }

    public Time(int hours, int minutes, int seconds) {
        this.check_valid_time(hours,minutes,seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public Time(String time) {
        String[] numbers = time.split(":");
        this.check_valid_time(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]), Integer.parseInt(numbers[2]));
        this.hours = Integer.parseInt(numbers[0]);
        this.minutes = Integer.parseInt(numbers[1]);
        this.seconds = Integer.parseInt(numbers[2]);

    }

    public Time(Time second){
        this.check_valid_time(second.hours, second.minutes, second.seconds);
        this.hours = second.hours;
        this.minutes = second.minutes;
        this.seconds = second.seconds;

    }

    private void check_valid_time(int hours, int minutes, int seconds){
        if (hours < 0 || hours > 24){
            throw new IllegalArgumentException("Wrong hours");

        }

        if (minutes > 60 || minutes < 0){
            throw new IllegalArgumentException("Wrong minutes");

        }

        if (seconds > 60 || seconds < 0){
            throw new IllegalArgumentException("Wrong seconds");

        }

    }

    @Override
    public String toString() {
        // (seconds % 3600 / 60 / 10) +   (seconds % 3600 / 60 % 10)
        return this.hours + ":" + (this.minutes / 60 + this.minutes % 60  ) + ":" + this.seconds;
    }

    public int get_all_seconds(){
        return this.hours * 3600 + this.minutes*60 + this.seconds;
    }

    public int get_all_minutes(){
        int result = 0;
        if (this.seconds >= 30){
            result = this.hours * 60 + this.minutes + 1;
        } else {
            result =  this.hours * 60 + this.minutes;
        }


        return result;

    }


    public Time time_dif(Time second){
        Time Res = new Time();
        int temp_all_seconds = this.get_all_seconds() - second.get_all_seconds();
        temp_all_seconds = temp_all_seconds % (24*3600);

        if (temp_all_seconds <= 0){
            temp_all_seconds = 24 * 3600 - Math.abs(temp_all_seconds);
        }

        Res.hours = temp_all_seconds / 3600;
        temp_all_seconds = temp_all_seconds % 3600;

        Res.minutes = temp_all_seconds / 60;
        temp_all_seconds = temp_all_seconds % 60;

        Res.seconds = temp_all_seconds;
        // Res.all_seconds = this.all_seconds - second.all_seconds;

        return Res;
    }

    public Time time_add(Time second){
        Time Res = new Time();

        int temp_all_seconds = this.get_all_seconds() + second.get_all_seconds();

        temp_all_seconds = temp_all_seconds % (24*3600);

        if (temp_all_seconds <= 0){
            temp_all_seconds = 24 * 3600 - Math.abs(temp_all_seconds);
        }

        Res.hours = temp_all_seconds / 3600;
        temp_all_seconds = temp_all_seconds % 3600;

        Res.minutes = temp_all_seconds / 60;
        temp_all_seconds = temp_all_seconds % 60;

        Res.seconds = temp_all_seconds;
        // Res.all_seconds = this.all_seconds - second.all_seconds;

        return Res;

        //Res.convert_all_seconds();
        //return Res;

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.check_valid_time(hours, this.minutes,this.seconds);
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.check_valid_time(this.hours, minutes,this.seconds);
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.check_valid_time(this.hours, this.minutes,seconds);
        this.seconds = seconds;
    }

}
