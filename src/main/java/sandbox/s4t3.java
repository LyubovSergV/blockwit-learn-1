//Написать программу, которая спрашивает имена и года рождения 4 людей.
// После этого выводит имена и кол-во лет.
package sandbox;

import java.util.Scanner;

public class s4t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[4];
        int[] yourOfBirth = new int[4];
        int[] age = new int[4];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите имя:");
            names[i] = in.nextLine();
        }
        for (int i = 0; i < yourOfBirth.length; i++) {
            System.out.println("Введите год рождения");
            yourOfBirth[i] = in.nextInt();
            age[i] = 2021 - yourOfBirth[i];
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " вам " + age[i]);
        }

        in.close();
    }
}
