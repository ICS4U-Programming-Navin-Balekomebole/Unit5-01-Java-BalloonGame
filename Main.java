import java.awt.Color;

/**
* The main class file.
*
* @author Navin Balekomebole
* @version 1.0
* @since 2023-05-29
*/
public final class Main {
    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // Here, the program will
        // Create a balloon.
        final Balloon balloonA = new Balloon(25, 52, Color.GREEN, 1);

        // Move the balloon
        // to a new location.
        System.out.println("Current balloon location: "
            + balloonA.xPosition + ", " + balloonA.yPosition);
        balloonA.moveBalloon(35, -27);
        System.out.println("New location: "
            + balloonA.xPosition + ", " + balloonA.yPosition);

        // This section of the code
        // will Change the color
        // of the balloon.
        System.out.println(balloonA.color);
        balloonA.changeColor(Color.RED);
        System.out.println(balloonA.color);

        // Create a spike.
        final Spike spike = new Spike(12);

        // Move the spike to the balloon and pop it.
        System.out.println("Balloon popped? " + balloonA.isPopped);
        System.out.println("Spike position: " + spike.xPosition);
        // Use an equation to match
        // the x position of the balloon.
        spike.moveSpike(balloonA.xPosition - spike.xPosition);
        System.out.println("New position: " + spike.xPosition);
        spike.popBalloon(balloonA);
        System.out.println("Balloon popped? " + balloonA.isPopped);
    }
}
