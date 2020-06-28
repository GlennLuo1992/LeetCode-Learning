package practise2019;

import java.util.HashSet;
import java.util.Set;

//暴力法时间复杂度和空间复杂度较高需要尝试使用其他的方法

public class _3_get_longest_string {

    public static void main(String[] args) {
//        lengthOfLongestSubstring_1("asdf");
//        boolean r=all_unique("ab");
//        System.out.println(r);
        String a = "aabccc";
        lengthOfLongestSubstring_2(a);
//        all_unique(a);


    }

//    暴力解决法：便利所有的子字符串，判断子字符串内部有没有重复的字符
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

//    滑动窗口法
//    与暴力解决方法相比，它的优势表现在哪里？
    static private int lengthOfLongestSubstring_2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
            System.out.println(set);
        }
        System.out.println(ans);
        return ans;
    }
}
