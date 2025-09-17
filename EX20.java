import java.util.*;
public class EX20 {
    public static List<String> split(String s, char delimiter) {
        List<String> parts = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == delimiter) {
                parts.add(current.toString());
                current.setLength(0); // очистить
            } else {
                current.append(c);
            }
        }
        parts.add(current.toString()); // добавить последний кусок
        return parts;
    }
    public static void main(String[] args) {
        String text = "one,two,three,four";
        List<String> result = split(text, ',');
        System.out.println(result); // [one, two, three, four]
    }
}
