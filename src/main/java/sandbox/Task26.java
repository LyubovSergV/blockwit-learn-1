//Есть массив данных:
//9,8,7,6,5,4,3,2,1
//Вывести числа в обратном порядке
package sandbox;

public class Task26 {
    public static void main(String[] args) {
        int[] Nambers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 8; i >= 0; i--){
            System.out.println(Nambers[i]);
        }
    }
}
