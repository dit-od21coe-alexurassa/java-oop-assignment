// demonstrates inheritance and polymorphism

/**
 * Inheritance emphasizes code-reuse. Here we can see that this class and other classes
 * can use the method `getPaperSize` smoothly instead of each class to implement the same thing.
 *
 * We can also see how to achieve polymorphism, considering the method `printPaperSize` which
 * was already implemented in the parent class, but this class uses it's name to provide its
 * own implementation.
 */
public class A4Paper extends Paper {
    public A4Paper() {
        this.setWidth(21);
        this.setHeight(29.7);
    }

    // polymorphism: using same method names to perform different actions
    @Override
    public void printPaperSize() {
        System.out.printf("A4 PAPER SIZE: %s centimetres%n", this.getPaperSize());
    }
}
