import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = sc.nextLine();
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        if (clean.equals(reversed)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
