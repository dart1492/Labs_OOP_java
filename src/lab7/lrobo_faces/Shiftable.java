package lab7.lrobo_faces;

public interface Shiftable extends Movable {
    int step_shift = 1;

    void shiftForward();

    void shiftBackward();
}
