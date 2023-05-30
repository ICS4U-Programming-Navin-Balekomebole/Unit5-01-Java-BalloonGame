import java.awt.Color;
/**
* The main class file.
*
* @author Navin Balekomebole
* @version 1.0
* @since 2023-05-29
*/

public class Balloon {
    // Public class ballon.
    // helps by
    // creating the fields.

    /**
     * The x-coordinate of
     * the balloon's position.
     */
    int xPosition;

    /**
     * The y-coordinate of the balloon's position.
     */
    int yPosition;

    /**
     * The color of the balloon.
     */
    Color color;

    /**
     * Indicates whether the balloon is popped or not.
     */
    boolean isPopped;

    /**
     * The ID of the balloon.
     */
    int id;

    /**
     * Constructs a Balloon object with the specified position, color, and ID.
     *
     * @param xInitial        the x-coordinate of the balloon's position
     * @param yInitial        the y-coordinate of the balloon's position
     * @param initialColor the principal color of the balloon
     * @param idMain      the ID of the balloon
     */
    public Balloon(int xInitial, int yInitial, Color initialColor, int idMain) {
        // Setting the values of the fields
        this.xPosition = xInitial;
        this.yPosition = yInitial;
        this.color = initialColor;
        this.isPopped = false;
        this.id = idMain;
    }

    /**
     * Changes the color of the balloon.
     *
     * @param newColor the new color to set for the balloon
     */
    public void changeColor(Color newColor) {
        // Change current color
        this.color = newColor;
    }

    /**
     * Moves the balloon by the specified amount in the x and y directions.
     *
     * @param xChange x-coordinate change
     * @param yChange y-coordinate change
     */
    public void moveBalloon(int xChange, int yChange) {
        // Change current values
        this.xPosition += xChange;
        this.yPosition += yChange;
    }
}
