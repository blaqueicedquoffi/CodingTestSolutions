public class ShortestPalidrome {
    public static void main(String[] args) {
        System.out.println(check("glihg"));
        System.out.println(check("i"));
        System.out.println(check("123456789"));
    }

    public static int check(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        int counter = 0;
        if (checkPal(s)) {
            return 0;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (!checkPal(s)) {
                    if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                        stringBuilder.insert(i, s.charAt(s.length() - 1 - i));
                        s=stringBuilder.toString();
                        counter++;
                    }
                }

            }
        }
        return counter;

    }

    public static boolean checkPal(String s) {
        String str = new StringBuilder(s).reverse().toString();
        return str.equals(s);

    }

    public static int shortTestCount(String s) {
        return shortestPalindrome(s).length() - s.length();
    }

    public static String shortestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (j >= 0) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j--;
        }

        if (i == s.length())
            return s;
        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = shortestPalindrome(s.substring(0, i));
        return prefix + mid + suffix;
    }
}
