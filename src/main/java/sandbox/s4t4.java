//Написать программу, которая спрашивает температуру за последние три дня,
// вычисляет среднюю температуру и выводит ее.
package sandbox;

import java.util.Scanner;

public class s4t4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] temperature = new int[3];
        double summ = 0, mean = 0;

        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Введите температуру");
            temperature[i] = in.nextInt();
            summ = summ + temperature[i];
            mean = summ / 3;
        }

        System.out.println("Средняя температура за три дня: " + mean);

        in.close();
    }
}
