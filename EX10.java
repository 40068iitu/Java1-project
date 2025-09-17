public class EX10 {
    public static String removeSpaces(String s) {
        return s.replaceAll("\\s+", "");
    }
    public static void main(String[] args) {
        String text = " a b\tc\nd e ";
        System.out.println(removeSpaces(text));
    }
}
