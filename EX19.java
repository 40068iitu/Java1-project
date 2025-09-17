import java.util.*;
public class EX19 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {3, 5, 8, 9};
        Set<Integer> merged = new LinkedHashSet<>();
        for (int x : arr1) merged.add(x);
        for (int x : arr2) merged.add(x);
        System.out.println("Объединённый массив без дубликатов: " + merged);
    }
}
