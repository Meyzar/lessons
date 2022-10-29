import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = sc.nextInt();
        switch(age){
            case 0:
                System.out.print(1);
                break;
            case 7:
                System.out.print(2);
                break;
            case 17:
                System.out.print(3);
                break;
            default:
                System.out.print(4);
        }
    }
}
