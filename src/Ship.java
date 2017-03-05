import java.util.Random;

/**
 * Created by E&K PC on 3/3/2017.
 */
public class Ship {
    int positionStart;
    int positionEnd;
    int size;

    /* public Ship(int position) {
         this.position = position;
     }*/
    void initWithRandomPositionAndSize() {
        Random random = new Random();
        size = random.nextInt(3) + 1;
        positionStart = random.nextInt(Field.SIZE - size + 1);
        positionEnd = positionStart + size;
    }

    boolean isIntersectWithAnotherShip(Ship ship) {
        //0123456789
        //0123    89
        //     56
        if (positionStart > ship.positionEnd + 1) {
            return false;
        }

        if (positionEnd + 1 < ship.positionStart) {
            return false;
        }

        return true;

    }

}
