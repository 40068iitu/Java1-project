public class EX5 {
    public static int findSubstring(String text, String pattern) {
        if (text == null || pattern == null) return -1;
        int n = text.length();
        int m = pattern.length();
        if (m == 0) return 0;
        if (m > n) return -1;
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findSubstring("hello world", "world"));
        System.out.println(findSubstring("abcabc", "cab"));
        System.out.println(findSubstring("abcdef", "gh"));
    }
}
