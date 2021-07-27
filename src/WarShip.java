import java.io.IOException;
import java.util.Random;

public class WarShip {
    static Matrix compMatrix;
    Matrix userMatrix;

    int rand(int bound) {
        return (new Random()).nextInt(bound);
    }

    boolean randBoolean() {
        return (new Random()).nextBoolean();
    }

    void createCompShip(int length) {
        while (!compMatrix.placeShip(
                new Ship(
                        rand(compMatrix.size),
                        rand(compMatrix.size),
                        length,
                        randBoolean()))) ;
    }

    void createUserShip() {

    }

    void creatCompFleet() {
        for (int i = 4; i > 0; i--) {
            for (int j = 4; j >= i; j--) {
                user(i);
            }
        }
    }

    void creatUserFleet() {
        for (int i = compMatrix.maxShipLenght; i > 0; i--) {
            for (int j = compMatrix.maxShipLenght; j >= i; j--) {
                System.out.println("Расположите корабль размером " + i + "клеток");
                createUserShip();
            }
        }
    }


    public static void main(String args[]) throws IOException {
        compMatrix = new Matrix(10,10);
            System.out.println(compMatrix.printComp());
    }
}

