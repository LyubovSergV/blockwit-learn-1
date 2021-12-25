//Написать программу, которая спрашивает у пользователя 5 имен.
// А затем выводит все эти имена.
package sandbox;


import java.util.Scanner;

public class s4t2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое имя");
        String nameFirst = in.nextLine();
        System.out.println("Введите второе имя");
        String nameSecond = in.nextLine();
        System.out.println("Введите третье имя");
        String nameThird = in.nextLine();
        System.out.println("Введите четвертое имя");
        String nameFourth = in.nextLine();
        System.out.println("Введите пятое имя");
        String nameFifth = in.nextLine();
        System.out.println(nameFirst +", "+ nameSecond +", "+ nameThird +", "+ nameFourth +", "+ nameFifth);
        in.close();
    }
}
