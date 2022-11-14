package lab7.robo_classes;

import lab7.lrobo_faces.Rotatable;
import lab7.lrobo_faces.Shiftable;

import java.util.ArrayList;
import java.util.List;

public class WalkRobot extends Robot implements Shiftable, Rotatable {
    private ArrayList<Action> actionList;

    public WalkRobot(){ // only default constructor
        this.x = 0;
        this.y = 0;
        this.course = 0;
    }

    public void view_actionList(){
        System.out.println(actionList.toString());
    }

    public void set_actionList(ArrayList<Action> actionList_original){
        this.actionList = actionList_original;
    }

    int[] get_position_tuple(){
        int[] arr = new int[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    private void define_action(Action.ActionTypes act){
        switch(act){
            case RotF -> this.rotateForward();
            case RotB -> this.rotateBackward();
            case ShiftF -> this.shiftForward();
            case ShiftB -> this.shiftBackward();
            case DoSomething -> this.doSomething();
        }
    }

    @Override
    public void move() {
        if (!actionList.isEmpty()){
            for (int i = 0; i < actionList.size(); i++ ){
                int k = 0;
                while(k < actionList.get(i).get_steps()){
                    this.define_action(actionList.get(i).get_action());

                    k++;
                }
                System.out.println(this.toString()); // will print after each action
            }
        } else {
            System.out.println("Action list is empty");
        }

    }

    @Override
    public void rotateForward() {
        course = course + Rotatable.step_angle;
        course = course % 360;
    }

    @Override
    public void rotateBackward() {
        if (course == 0) {
            course = 360;
        }
        course = course - Rotatable.step_angle;

        course = course % 360;
    }

    @Override
    public void shiftForward() {
        switch (course){
            case 0 -> this.x += Shiftable.step_shift;
            case 90 -> this.y -= Shiftable.step_shift;
            case 180 -> this.x -= Shiftable.step_shift;
            case 270 -> this.y += Shiftable.step_shift;
        }
    }

    @Override
    public void shiftBackward() {
        switch (course){
            case 0 -> this.x -= Shiftable.step_shift;
            case 90 -> this.y += Shiftable.step_shift;
            case 180 -> this.x += Shiftable.step_shift;
            case 270 -> this.y -= Shiftable.step_shift;
        }
    }

    @Override
    public String toString(){
        return "x pos: " + this.x + ", y pos: " + this.y + ", course: " + this.course;
    }



}
