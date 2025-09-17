public class EX15 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 5};
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) minIndex = i;
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        System.out.print("Результат: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
