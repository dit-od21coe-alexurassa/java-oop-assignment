import java.lang.Math;

// demonstrates abstraction and encapsulation

/**
 * ### Abstraction
 * Is all about hiding implementation details and only exposing what is necessary to the user.
 * A users that extend this class can directly use the method `getPaperSize` without knowing
 * how it works internally.
 *
 * ### Encapsulation
 * Allows data security to protect it from system-wide access or change.
 *
 * Example below shows how encapsulation is implemented using private modifies and through
 * getters and setters.
 */
public abstract class Paper {
    private double width;
    private double height;

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double newValue) {
        this.width = newValue;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double newValue) {
        this.height = newValue;
    }


    public double getPaperSize() {
        final double perimeter = this.width * this.height;
        return Math.floor(perimeter);
    }

    public void printPaperSize() {
        System.out.printf("%s%n", this.getPaperSize());
    }
}
