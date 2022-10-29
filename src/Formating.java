public class Formating {
    public static void main(String[] args) {
        System.out.printf("String %.2f \n", 45.32245);
        System.out.printf("String %.2f \n", 45.123);
        System.out.printf("String %.2f \n", 45.78);

        System.out.printf("String %10d \n", 532);
        System.out.printf("String %10d \n", 6);
        System.out.printf("String %10d \n", 1000000000);

        System.out.printf("String %s \n", "Hello");
        System.out.printf("String %s \n", "My");
        System.out.printf("String %s \n", "Friends");

        // %s - строки , %d - целые числа , %f - дробные числа , \n - нов. строка
    }
}
