package shapeProcess;

import shapePack.*;

public class ShapeExecute {
    public static void main(String[] args) {
        // Create a Square object
        Square square = new Square();
        System.out.println("Calling methods using Square object:");
        square.printSquare();
        square.printRectangle();
        square.printShape();
        
        // Create a SemiCircle object
        SemiCircle semiCircle = new SemiCircle();
        System.out.println("\nCalling methods using SemiCircle object:");
        semiCircle.printSemiCircle();
        semiCircle.printCircle();
        semiCircle.printShape();
    }
}