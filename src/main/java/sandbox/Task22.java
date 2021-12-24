//Есть массив данных:
//223,766,487,23
//Вывести каждое второе число
package sandbox;

public class Task22 {
    public static void main(String[] args) {
        int[] Numbers = {223, 766, 487, 23};
        for (int i = 0; i < Numbers.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println(Numbers[i]);
            }
        }
    }
}
