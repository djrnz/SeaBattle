import java.util.Random;
import java.util.StringJoiner;

/**
 * Created by E&K PC on 3/3/2017.
 */
public class Ship {
    int positionSart;
    int positionEnd;
    int size;



/*
  int position;
 public Ship(int position) {
        this.position = position;
    }*/

void initWithRandomPositionAndSize() {
    Random random = new Random();
    size = random.nextInt(3)+ 1; // 1-3
    positionSart = random.nextInt(Field.SIZE - size + 1);
    positionEnd = positionSart + size;
}

    boolean isIntersectWithAnotherShip(Ship ship) {
    //0123456789
    //0123    89
    //     56
        if (positionSart > ship.positionEnd + 1) {
            return false;
        }
        if (positionEnd + 1 < ship.positionSart) {
            return false;
        }
        return true;
    }


}
