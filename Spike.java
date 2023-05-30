/**
* This file contains the spike class.
*
* @author Navin Balekomebole
* @version 1.0
* @since 2023-05-30
*/
public class Spike {
    public static final int YPOSITION = 0;
    int xPosition;

    /**
     * Constructs a spike object with the specified position.
     *
     * @param posX        the x-coordinate of the balloon's position
     */
    public Spike(int posX) {
        this.xPosition = posX;
    }

    /**
     * Pops a balloon.
     *
     * @param balloon the balloon to pop
     */
    public void popBalloon(Balloon balloon) {
        if (balloon.xPosition == this.xPosition && balloon.yPosition
            == this.YPOSITION) {
            balloon.isPopped = true;
        }
    }

    /**
     * Moves the spike.
     *
     * @param amount the amount it is moved.
     */
    public void moveSpike(int amount) {
        // Changing the x value of the spike
        this.xPosition += amount;
    }
}
