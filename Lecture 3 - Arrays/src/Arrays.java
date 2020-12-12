public class Arrays {
    public static void main(String[] args) {

/*//       int[] array; //declaration
//       array = new int[10]; //Initialization
//       int[] array = new int[10]; //delration and initialization
       int[] array = {5,7,-2,12,0,5};
        for (int i = 0;i<array.length; i++){
            System.out.println(array[i]);
        }*/
        int[] numbers = {-3,2,11,5};
        int[] numbersTwo = new int[5];
        System.out.println(numbers.length);
        for (int i = 0;i < numbers.length; i++){
            numbers[i] = i;
        }
        for (int i = 0;i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("");
        for (int i = 0;i < numbersTwo.length; i++){
            numbersTwo[i] = i*2;
        }
        for (int i = 0;i < numbersTwo.length; i++){
            System.out.print(numbersTwo[i] + ", ");
        }
    }
}
