//Написать программу, которая спрашивает у пользователя четыре числа.
// А затем меняет местами первое и последнее число и выводит все числа.
package sandbox;

import java.util.Scanner;

public class s4t6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number = new int[4];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Введите число");
            number[i] = in.nextInt();
        }
        int temp = number[0];
        number[0] = number[number.length - 1];
        number[number.length - 1] = temp;
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        in.close();
    }
}
