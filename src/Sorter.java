public class Sorter {

    // bubble sorts in ascending order, builds sorted array from the back
    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // selection sorts in ascending order, builds sorted array from the back
    public static void selectionSort(int[] array) {
        int temp, locationOfMax;
        for (int i = 1; i <= array.length - 1; i++) {
            locationOfMax = 0;
            for (int j = 0; j <= array.length - i; j++) {
                if (array[j] > array[locationOfMax]) {
                    locationOfMax = j;
                }
            }
            if (locationOfMax != array.length - i) {
                temp = array[array.length - i];
                array[array.length - i] = array[locationOfMax];
                array[locationOfMax] = temp;
            }
        }
    }


    // insertion sorts in ascending order, builds sorted array from the front
    public static void insertionSort(int[] array) {
        int temp, compareWith;
        for (int i = 1; i <= array.length - 1; i++) {
            temp = array[i];
            compareWith = i - 1;
            while (compareWith >= 0 && array[compareWith] > temp) {
                array[compareWith + 1] = array[compareWith];
                compareWith--;
            }
            array[compareWith + 1] = temp;
        }
    }


    // bubble sorts in descending order, builds sorted array from the front
    public static void bubbleSort2(int[] array) {
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = array.length - 1 - i; j >= 0; j--) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // insertion sorts in descending order, builds sorted array from the front
    public static void selectionSort2(int[] array) {
        int temp, locationOfMin;
        for (int i = 1; i <= array.length - 1; i++) {
            locationOfMin = 0;
            for (int j = 0; j <= array.length - i; j++) {
                if (array[j] < array[locationOfMin]) {
                    locationOfMin = j;
                }
            }
            if (locationOfMin != array.length - i) {
                temp = array[array.length - i];
                array[array.length - i] = array[locationOfMin];
                array[locationOfMin] = temp;
            }
        }
    }

    // insertion sorts in descending order, builds sorted array from the back
    public static void insertionSort2(int[] array) {
        int temp;
        for (int i = array.length - 1; i > 1; i--) {
            for (int j = i - 1; j > 0; j--) {
                for (int k = 0; k <= j; k++) {
                    if (array[k + 1] > array[k]) {
                        temp = array[k];
                        array[k] = array[k + 1];
                        array[k + 1] = temp;
                    }
                }
            }
        }
    }
}
