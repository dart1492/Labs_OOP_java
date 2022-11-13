package lab5;

public class Main {

    public static void main(String[] args) {
        Linear first = new Linear(1,2);
        first.GetInfo();

        Quadratic second = new Quadratic(1,0,0);
        second.GetInfo();


        Root[] arr = new Root[4];

        for (int i = 0; i < 4; i++){
            if (i % 2 == 0){
                arr[i] = new Linear(i + 1,i + 2);
            } else {
                arr[i] = new Quadratic(i + 1,i + 2, i+3);
            }

        }

        for (int i = 0; i < 4; i++){
            arr[i].GetInfo();
        }

    }


}
