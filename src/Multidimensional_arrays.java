public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[][] numb = new int[3][3];
        for (int i = 0;i < 3;i++){
            System.out.println();
            for (int j = 0;j<3;j++){
                System.out.print(numb[i][j] + " ");
            }
        }
        System.out.println();
        int [][] numb1 = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println(numb1[0][2]);
        System.out.println();
        for (int i = 0;i < numb1.length;i++){
            System.out.println();
            for (int j = 0;j<numb1[i].length;j++){
                System.out.print(numb1[i][j] + " ");
            }
        }
    }
}
