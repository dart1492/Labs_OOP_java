package lab7.lrobo_faces;

public interface Rotatable extends Movable {

    int step_angle = 90;

    void rotateForward();
    void rotateBackward();
}
