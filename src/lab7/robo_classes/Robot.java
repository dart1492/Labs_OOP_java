package lab7.robo_classes;

public class Robot {

    protected int x;
    protected int y;
    protected int course;

    Robot(){
        this.x = 0;
        this.y = 0;
        course = 0;
    }

    Robot(int x, int y){
        this.x = x;
        this.y = y;
        course = 0;
    }

    void doSomething(){
        System.out.println("Robot is doing something...");
    }

}
