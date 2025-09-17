import java.util.*;
public class EX17 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 2, 5, 3, 2, 1};
        Set<Integer> set = new LinkedHashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        System.out.println("Массив без дубликатов: " + set);
    }
}
