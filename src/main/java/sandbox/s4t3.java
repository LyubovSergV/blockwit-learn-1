//Написать программу, которая спрашивает имена и года рождения 4 людей.
// После этого выводит имена и кол-во лет.
package sandbox;

import java.util.Scanner;

public class s4t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое имя");
        String nameFirst = in.nextLine();
        System.out.println("Введите год рождения");
        int yearOfBirthFirst = in.nextInt();

        System.out.println("Введите второе имя");
        String nameSecond = in.nextLine();
        System.out.println("Введите год рождения");
        int yearOfBirthSecond = in.nextInt();

        System.out.println("Введите третье имя");
        String nameThird = in.nextLine();
        System.out.println("Введите год рождения");
        int yearOfBirthThird = in.nextInt();

        System.out.println("Введите четвертое имя");
        String nameFourth = in.nextLine();
        System.out.println("Введите год рождения");
        int yearOfBirthFourth = in.nextInt();

        int ageFirst = 2021 - yearOfBirthFirst;
        int ageSecond = 2021 - yearOfBirthSecond;
        int ageThird = 2021 - yearOfBirthThird;
        int ageFourth = 2021 - yearOfBirthFourth;


        System.out.println(nameFirst + "! Вам " + ageFirst + " лет");
        System.out.println(nameSecond + "! Вам " + ageSecond + " лет");
        System.out.println(nameThird + "! Вам " + ageThird + " лет");
        System.out.println(nameFourth + "! Вам " + ageFourth + " лет");

        in.close();
    }
}
