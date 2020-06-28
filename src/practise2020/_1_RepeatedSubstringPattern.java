package practise2020;

public class _1_RepeatedSubstringPattern {

    private static boolean repeatedSubstringPattern(String s){
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        boolean result = repeatedSubstringPattern("ababa");
        System.out.println(result);
    }
}
