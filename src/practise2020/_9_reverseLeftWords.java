package practise2020;


public class _9_reverseLeftWords {
    public static String reverseLeftWords(String s, int n) {
        char[] str = s.toCharArray();
        char[] result = new char[str.length];
        int index = 0;
        for(int i=0; i < str.length; i++){
            if(i<str.length-n){
                result[i] = str[i+n];
            }else{
                result[i] = str[index];
                index++;
            }
        }
        return new String(result);
    }
    public static String reverseLeftWords_1(String s, int n) {
        String s1 = s.substring(0,n);
        String s2 = s.substring(n);
        return s2 + s1;
    }

    public static void main(String[] args) {
        String input = "abcdefg";
        int num = 4;
        System.out.println(reverseLeftWords_1(input,num));
    }
}
