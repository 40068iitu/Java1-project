import java.util.*;
public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write words or senteces:");
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }
        System.out.println("The longest word: " + longest);
    }
}
