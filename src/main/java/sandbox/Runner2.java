
package sandbox;

import java.util.Random;
import java.util.Scanner;

public class Runner2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество палочек");
        int countOfSticks = in.nextInt();
        in.nextLine();
        System.out.println("Введите количество игроков");
        int number=in.nextInt();

        Random random=new Random();

        boolean isComputer = false;
        for (; countOfSticks > 0; ) {
            System.out.println("Сейчас " + countOfSticks + " палочек");
            int dropSticks;
            int maxSticks = 3;
            if (countOfSticks < 3) {
                maxSticks = countOfSticks;
            }
            if (isComputer) {
                System.out.println("Ход компьютера");
                dropSticks = random.nextInt(maxSticks)+1;
                System.out.println("Компьютер взял " + dropSticks + "палочек");
            } else {
                System.out.println("Ход пользователя");
                System.out.println("Введите кол-во палочек от 1 до" + maxSticks);
                dropSticks = in.nextInt();
                System.out.println("Пользователь взял " + dropSticks + " палочек");
            }
            countOfSticks = countOfSticks - dropSticks;
            isComputer = !isComputer;
        }
        if (isComputer) {
            System.out.println("Выиграл компьютер");
        } else {
            System.out.println("Выиграл пользователь");
        }
        in.close();
    }
}
