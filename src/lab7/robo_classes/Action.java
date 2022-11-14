package lab7.robo_classes;

import java.util.List;

public class Action {

    final private int step_count;
    private ActionTypes type;

    public static enum ActionTypes{
        RotF, RotB, ShiftF, ShiftB, DoSomething
    }

    public ActionTypes get_action(){
        return type;
    }

    public void set_action(ActionTypes a){
        this.type = a;
    }

    Action(){
        this.step_count = 1;
        this.type = ActionTypes.DoSomething;
    }

    public Action(int steps, ActionTypes e){
        this.step_count = steps;
        this.type = e;
    }

    @Override
    public String toString(){
        return "Action type: " + type.toString() + ", steps:" + step_count;
    }

    public int get_steps(){
        return step_count;
    }



}
