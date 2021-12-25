//Написать программу, которая спрашивает, сколько у Вас друзей.
// А потом спрашивает имена этих друзей. Затем выводит имена друзей в обратном порядке.
package sandbox;

import java.util.Scanner;

public class s4t5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько у вас друзей?");
        int number = in.nextInt();
        in.nextLine();
        System.out.println("У вас " + number + " друзей");
        String[] names = new String[number];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите имя: ");
            names[i] = in.nextLine();
        }
        for (int i = number - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        in.close();
    }
}
