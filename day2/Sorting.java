
public class Sorting {

    public static void main(String[] args) {

    }

    public void bubbleSort() {
        int[] arr = {7, 84, 8, 22, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {

            System.out.println(arr[i]);
        }
    }

    public void selectionSort() {
        int arr[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }

            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
    }
}
