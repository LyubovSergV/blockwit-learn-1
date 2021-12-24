//Есть массив данных:
//6,2,8,2,6,2,2,95,34
//Вывести все числа, начиная со второго
package sandbox;

public class Task25 {
    public static void main(String[] args) {
        int[] Nambers = {6, 2, 8, 2, 6, 2, 2, 95, 34};
        for (int i = 1; i < Nambers.length; i++) {
            System.out.println(Nambers[i]);
        }
    }
}
