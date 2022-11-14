package lab7;

import lab7.robo_classes.Action;
import lab7.robo_classes.RotRobot;
import lab7.robo_classes.WalkRobot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        WalkRobot main_robot = new WalkRobot(); // our main robot
        ArrayList<Action> first_l = new ArrayList<>(); // action list

        first_l.add(new Action(3, Action.ActionTypes.ShiftF));
        first_l.add(new Action(1, Action.ActionTypes.RotF));
        first_l.add(new Action(4, Action.ActionTypes.ShiftF));
        first_l.add(new Action(1, Action.ActionTypes.RotB));
        first_l.add(new Action(1, Action.ActionTypes.ShiftF));
        first_l.add(new Action(1, Action.ActionTypes.RotB));
        first_l.add(new Action(2, Action.ActionTypes.ShiftF));
        first_l.add(new Action(1, Action.ActionTypes.RotB));
        first_l.add(new Action(7, Action.ActionTypes.ShiftF));
        first_l.add(new Action(1, Action.ActionTypes.RotF));
        first_l.add(new Action(1, Action.ActionTypes.ShiftF));
        first_l.add(new Action(1, Action.ActionTypes.RotF));
        first_l.add(new Action(2, Action.ActionTypes.ShiftF));

        main_robot.set_actionList(first_l);
        main_robot.move();





    }
}
