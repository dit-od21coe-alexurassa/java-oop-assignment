// demonstrates inheritance and polymorphism
public class A3Paper extends Paper {

    public A3Paper() {
        this.setWidth(29.7);
        this.setHeight(42);
    }

    // polymorphism: using same method names to perform different actions
    @Override
    public void printPaperSize() {
        System.out.printf("A3 PAPER SIZE: %s centimetres%n", this.getPaperSize());
    }
}
