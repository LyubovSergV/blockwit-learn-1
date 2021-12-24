
package sandbox;

import java.util.Scanner;

public class Runner1 {
    public static void main(String[] args) {
        int countOfSticks = 5;

        Scanner in = new Scanner(System.in);

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
                dropSticks = 1;
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
