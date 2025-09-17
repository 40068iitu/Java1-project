import java.util.*;
public class EX1 {
    public static void main(String[] args) {
        String input = "Java is great and Java is powerful";
        Arrays.stream(input.toLowerCase().split("\\s+"))
                .distinct()
                .forEach(System.out::println);
    }
}
