//Написать программу, которая спрашивает у пользователя его год рождения и имя.
// Затем вычисляет сколько ему лет и выводит в формате: "<имя>, вам <кол-во_лет> лет"
package sandbox;

import java.util.Scanner;

public class s4t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name = in.nextLine();
        System.out.println("Введите год рождения");
        int yearOfBirth = in.nextInt();
        int age = 2021 - yearOfBirth;
        System.out.println(name + " Вам " + age + " лет");

        in.close();
    }
}
