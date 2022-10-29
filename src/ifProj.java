import java.util.Scanner;

public class ifProj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 5){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
