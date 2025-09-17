public class EX14 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 9, 4, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        System.out.println("Сумма элементов на чётных индексах: " + sum);
    }
}
