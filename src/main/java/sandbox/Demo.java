package sandbox;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);

        System.out.println("Введите свое имя ");
        String name = in.nextLine();
        System.out.println("Дорый вечер, " + name + "! Введите год рождения ") ;
        int yearOfBirth = in.nextInt();
        int age = 2021 - yearOfBirth;
        System.out.println(name + ", Вам  " + age + " лет!") ;

        in.close();

    }
}
