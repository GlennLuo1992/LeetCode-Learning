import java.util.HashSet;
import java.util.Set;

//暴力法时间复杂度和空间复杂度较高需要尝试使用其他的方法

public class _3_get_longest_string {

    public static void main(String[] args) {
//        lengthOfLongestSubstring_1("asdf");
//        boolean r=all_unique("ab");
//        System.out.println(r);
        String a = "vwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCD";
        lengthOfLongestSubstring_1(a);
//        all_unique(a);

    }

    static private int lengthOfLongestSubstring_1(String s) {
        String longest = "";
        int length = 0;
//        遍历所有的子字符串
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String substring = s.substring(i, j);
                if (all_unique(substring) && length<substring.length()) {
                    longest = substring;
                    length = substring.length();
                }
            }
        }
        System.out.println(longest);
        System.out.println(length);
        return length;
    }

    static private boolean all_unique(String string) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            Character ch = string.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
}
