package lab7.robo_classes;

import lab7.lrobo_faces.Shiftable;

public class ShiftRobot extends Robot implements Shiftable {

    private int start_shift;
    private int end_shift;

    ShiftRobot(int x, int y, int end_shift, int course){
        super(x, y);

        this.course = course;
        this.start_shift = course;
        this.end_shift = end_shift;
        this.course = 90;
    }


    @Override
    public void move() {
        doSomething();
        while(this.x!= end_shift) {
            if(end_shift>start_shift) this.shiftForward();
            if (end_shift<start_shift) this.shiftBackward();
            doSomething();
        }
        System.out.println("Reset to start...");
        int temp = end_shift;
        end_shift = start_shift;
        start_shift = temp;
        doSomething();
        while(this.x!= end_shift) {
            if(end_shift>start_shift) this.shiftForward();
            if (end_shift<start_shift) this.shiftBackward();
            doSomething();
        }
    }


    public void shiftForward() {
        this.x = (this.x +step_shift);
    }
    public void shiftBackward() {
        this.x = (this.x -step_shift);
    }


    @Override
    void doSomething(){
        System.out.println("Shift robot is shifting (so smooth!)...");
    }

}
