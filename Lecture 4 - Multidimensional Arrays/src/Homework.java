import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
//        Task 1
/*        int[][] myArray = {
                {4158,72,13,14,15},
                {21,22,53,24,75},
                {31,57,33,34,35},
                {41,95,43,44,45},
                {59,52,53,5,55},
                {61,69,63,-64,65}
        };
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        for (int i = 0;i < myArray.length;i++){
            for (int j = 0;j < myArray[i].length;j++){
                if (myArray[i][j] > highest){
                    highest = myArray[i][j];
                }
                if (myArray[i][j] < lowest){
                    lowest = myArray[i][j];
                }
            }
        }
        System.out.println("Highest number is " + highest);
        System.out.println("Lowest number is " + lowest);*/
//        Task 2
/*        int[][] myArray = {
                {1,4,6,3},
                {5,9,7,2},
                {4,8,1,9},
                {2,3,4,5},
        };
        int[] mainDiagonal = new int[myArray.length];
        int[] secondaryDiagonal = new int[myArray.length];
        for (int i = 0;i < myArray.length;i++){
                mainDiagonal[i] = myArray[i][i];
                secondaryDiagonal[i] = myArray[i][myArray.length - 1 - i];
                }
        System.out.println(Arrays.toString(mainDiagonal));
        System.out.println(Arrays.toString(secondaryDiagonal));*/
//        Task 3
/*        int[][] myArray = {
        {1,72,13,14,15},
        {21,22,53,24,75},
        {31,57,33,34,35},
        {41,95,43,44,45},
        {59,52,53,5,55},
        {61,69,63,-64,67}
        };
        double sum = 0;
        double count = 0;
        for (int i = 0;i < myArray.length;i++){
            for (int j = 0;j < myArray[i].length;j++){
                sum += myArray[i][j];
                count++;
            }
        }
        double Average = sum/count;
        System.out.println("Sum is " + sum);
        System.out.println("Count is " + count);
        System.out.println("Average number is " + Average);*/
//        Task 4
/*        int[][] myArray = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        int[][] myArrayTwo = new int[myArray[0].length][myArray.length];

        System.out.println(myArray.length);
        System.out.println(myArray[0].length);

        for (int i = 0;i < myArray.length;i++){
            for (int j = 0;j < myArray[i].length;j++){
                myArrayTwo[j][i] = myArray[myArray.length-1-i][j];
            }
        }
        System.out.println(Arrays.deepToString(myArrayTwo));*/
//        Task 5
/*        int[][] myArray = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int highestSumRows = Integer.MIN_VALUE;
        int highestSumColumns = Integer.MIN_VALUE;

        for (int i = 0;i < myArray.length;i++){
            int sumRows = 0;
            int sumColumns = 0;
            for (int j = 0;j < myArray[i].length;j++){
                sumRows += myArray[i][j];
                sumColumns += myArray[j][i];
            }
            if (sumRows>highestSumRows){
                highestSumRows = sumRows;
            }
            if (sumColumns>highestSumColumns){
                highestSumColumns = sumColumns;
            }
        }
        System.out.println("Highest sum on rows is "+highestSumRows );
        System.out.println("Hughest sum on columns is " + highestSumColumns);
        if (highestSumRows>highestSumColumns){
            System.out.println("Highest sum of rows is > than highest sum of columns");
        }else if (highestSumColumns>highestSumRows){
            System.out.println("Highest sum of rows is < than highest sum of columns");
        }else{
            System.out.println("Highest sums are equal");
        }*/
//        Task 6
/*        int[][] myArray = {
            {11,12,13,14,15,16},
            {21,22,23,24,25,26},
            {31,32,33,34,35,36},
            {41,42,43,44,45,46},
            {51,52,53,54,55,56},
            {61,62,63,64,65,66},
        };
        int[][] myArrayTwo = new int[myArray.length/2][myArray.length];
        int[] myArraySums = new int[3];
        int totalSum = 0;
        int counter = 0;

        for (int i = 0;i < myArray.length;i++){
            if (i%2 == 1) {
                for (int j = 0; j < myArray[i].length; j++) {
                    myArrayTwo[counter][j] = myArray[i][j];
                    myArraySums[counter]+=myArray[i][j];
                    System.out.print(myArrayTwo[counter][j] + ", ");
                }
                System.out.print("sum: " + myArraySums[counter]);
                totalSum+=myArraySums[counter];
                counter++;
                System.out.println("");
            }
        }
        System.out.println("Total sum is " + totalSum);*/
//        Task 7
/*        int[][] myArray = {
                {11,12,13,14,15,16},
                {21,22,23,24,25,26},
                {31,32,33,34,35,36},
                {41,42,43,44,45,46},
                {51,52,53,54,55,56},
                {61,62,63,64,65,66},
        };
        int[][] myArrayTwo = new int[myArray.length][myArray.length];
        int[] myArraySums = new int[6];
        int totalSum = 0;
        int counter = 0;
        for (int i = 0;i < myArray.length;i++){
                for (int j = 0; j < myArray[i].length; j++) {
                    if ((i+j)%2 == 0) {
                        myArrayTwo[counter][j] = myArray[i][j];
                        myArraySums[counter]+=myArray[i][j];
                        System.out.print(myArrayTwo[counter][j] + ", ");
                    }

                }
                System.out.print("sum: " + myArraySums[counter]);
                totalSum+=myArraySums[counter];
                counter++;
                System.out.println("");
        }
        System.out.println("Total sum is " + totalSum);*/
//        Task 5.1
/*       int[][] myArray = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int highestSumRows = Integer.MIN_VALUE;
        int highestSumColumns = Integer.MIN_VALUE;

        for (int i = 0;i < myArray.length;i++){
            int sumRows = 0;
            int sumColumns = 0;
            for (int j = 0;j < myArray[i].length;j++){
                sumRows += myArray[i][j];
                sumColumns += myArray[j][i];
            }
            if (sumRows>highestSumRows){
                highestSumRows = sumRows;
            }
            if (sumColumns>highestSumColumns){
                highestSumColumns = sumColumns;
            }
        }
        System.out.println("Highest sum on rows is "+highestSumRows );
        System.out.println("Hughest sum on columns is " + highestSumColumns);
        if (highestSumRows>highestSumColumns){
            System.out.println("Highest sum of rows is > than highest sum of columns");
        }else if (highestSumColumns>highestSumRows){
            System.out.println("Highest sum of rows is < than highest sum of columns");
        }else{
            System.out.println("Highest sums are equal");
        }*/
    }
}
