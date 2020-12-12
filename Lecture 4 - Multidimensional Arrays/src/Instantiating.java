import java.util.Arrays;

public class Instantiating {
    public static void main(String[] args) {
        int[][] array2D = new int[2][3];
        int[][][] array3D = new int[2][2][3];

        int[][] arr2 = {
                {1,2,3},
                {4,5,6,9},
                {7}
        };
/*        System.out.println(array2D.length);
        System.out.println(array2D[0].length);

        System.out.println(array3D.length);
        System.out.println(array3D[0].length);
        System.out.println(array3D[0][0].length);*/

/*        array2D[1][1] = 5;
        for (int i =0; i<array2D.length; i++){
            for (int j = 0; j<array2D[i].length;j++){
                System.out.print(array2D[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.toString());*/
        System.out.println(Arrays.deepToString(arr2));


    }
}
