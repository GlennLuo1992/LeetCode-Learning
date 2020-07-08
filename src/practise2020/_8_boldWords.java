package practise2020;

import java.util.ArrayList;
import java.util.List;

public class _8_boldWords {
    public static void main(String[] args) {
        String[] words = new String[]{"ab", "bc"};
        System.out.println(boldWords(words, "aababcddd"));
    }

    public static String boldWords(String[] words, String S) {
        boolean[] isBold = new boolean[S.length()];
        for (String word : words) {
            int n = S.indexOf(word, 0);
            while (n != -1) {
                for (int i = n; i < n + word.length(); i++) isBold[i] = true;
                n = S.indexOf(word, n + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (isBold[0]) sb.append("<b>");
        for (int i = 0; i < isBold.length; i++) {
            sb.append(S.charAt(i));
            if (i == isBold.length - 1) {
                if (isBold[i]) sb.append("</b>");
                break;
            }
            if (isBold[i] && !isBold[i + 1]) sb.append("</b>");
            if (!isBold[i] && isBold[i + 1]) sb.append("<b>");
        }
        return sb.toString();
    }
}
