import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random numGen = new Random();

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = numGen.nextInt(100);
        }

        System.out.println("Before Sorting ...");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // change this line to test other algorithms
        Sorter.bubbleSort(array);

        System.out.println("After Sorting ...");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
