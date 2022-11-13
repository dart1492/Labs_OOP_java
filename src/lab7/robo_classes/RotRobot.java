package lab7.robo_classes;

import lab7.lrobo_faces.Rotatable;

public class RotRobot extends Robot implements Rotatable {
    private final int start_angle;
    private final int end_angle;

    public RotRobot(){
        super();
        start_angle = 0;
        end_angle = 180;
    }

    RotRobot(int x, int y, int start_angle, int end_angle){
        super(x, y);

        if (start_angle % 90 == 0 && end_angle % 90 == 0){ // перевірка щоб кути були кратні 90
            this.start_angle = start_angle;
            this.end_angle = end_angle;
        } else {
            throw new IllegalArgumentException("Wrong values for start or end");
        }

    }

    @Override
    public void move() {
        System.out.println("Course is" + course + " end is:" + end_angle);
       if (this.course == this.end_angle){
           while(this.course != start_angle){ // potentially infinite
               this.rotateBackward();
               this.doSomething();
           }
       } else if (this.course == this.start_angle){
           while(this.course != end_angle){ // potentially infinite
               this.rotateForward();
               this.doSomething();
           }
       } else {
           System.out.println("course is not at end_angle, neither at start_angle...");

       }


    }

    @Override
    public void rotateForward() {
        this.course += Rotatable.step_angle;
        this.course = this.course % 360;
    }

    @Override
    public void rotateBackward() {
        this.course -= Rotatable.step_angle;
        this.course = this.course % 360;
    }

    @Override
    void doSomething(){
        System.out.println("RotRobot is Rotating 90 per turn...");
    }

}
