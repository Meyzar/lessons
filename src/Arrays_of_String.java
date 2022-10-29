public class Arrays_of_String {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "hello ";
        str[1] = "world";
        str[2] = "!";
        for(int i = 0;i < str.length;i++){ // 1-й вариант
            System.out.print(str[i]);
        }
        System.out.println();
        for(String x:str){ // 2-й вариант
            System.out.print(x + " ");
        }
        System.out.println();
        int[] num = {23, 54, 1, 96};
        int sum = 0;
        for (int x: num){
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
