import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int n = sc.nextInt();
        int [] num = new int[n]; // Создаем новый массив с 5 неизвесными элементами.
        for (int i = 0;i < n; i++){
            System.out.print("Введите элемент: ");
            num[i] = sc.nextInt();
            System.out.println(num[i] + " " + i);
        }

        int [] num1= {3, 44, 6, 1, 7};       // Создаем новый массив с извесными элементами.
        for (int j = 0;j < num1.length; j++){
            System.out.println(num1[j]);
        }
    }
}
