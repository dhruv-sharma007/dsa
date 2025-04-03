
public class Sorting {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        // sorting.selectionSort();
        // sorting.bubbleSort();
        sorting.insertionSort();
    }

    public void bubbleSort() {
        int[] arr = {4, 5, 3, 1, 2};

        System.out.println("\nInitial array (Bubble Sort):");
        printArray(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("After pass " + (i + 1) + ":");
            printArray(arr);
        }

        System.out.println("Sorted array (Bubble Sort):");
        printArray(arr);
    }

    private void selectionSort() {
        int arr[] = {5, 4, 3, 2, 1};

        System.out.println("Initial array (Selection Sort):");
        printArray(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

            System.out.println("After pass " + (i + 1) + ":");
            printArray(arr);
        }

        System.out.println("Sorted array (Selection Sort):");
        printArray(arr);
    }

    private void insertionSort() {
        int arr[] = {1, 4, 5, 7, 2};

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
        printArray(arr);
    }

    private void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
