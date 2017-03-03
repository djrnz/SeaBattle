/**
 * Created by E&K PC on 3/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship(4);
        field.init();
        field.setShip(ship);
        System.out.println("Game Start!");

        do {
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);
        } while (field.isNotGameOver());
    }
}
