import java.util.*;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        String vowelSet = "aeiou";

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // только английские буквы
                if (vowelSet.indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }
}
