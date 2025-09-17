public class EX18 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 3};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Нет второго максимума");
        } else {
            System.out.println("Второй максимум: " + secondMax);
        }
    }
}
