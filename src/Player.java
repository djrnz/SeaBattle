import java.util.Scanner;

/**
 * Created by E&K PC on 3/3/2017.
 */
public class Player {
    int getShoot() {
        System.out.println("Куда стрелять?");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.printf("Вы ввели: %s\n", s);

        int shoot = Integer.parseInt(s);
        return shoot;
    }

}
