package practise2020;

public class _11_calculateTime {
    public static int calculateTime(String keyboard, String word) {
        char[] keyboardArray = keyboard.toCharArray();
        char[] wordArray = word.toCharArray();
        int currentIndex = 0;
        int resultTime = 0;
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < keyboardArray.length; j++) {
                if (wordArray[i] == keyboardArray[j]){
                    resultTime+=Math.abs(j-currentIndex);
                    currentIndex = j;
                }
            }
        }
        return resultTime;
    }
    public static void main(String[] args) {
        String keyboard = "pqrstuvwxyzabcdefghijklmno";
        String word = "leetcode";
        System.out.println(calculateTime(keyboard, word));
    }
}
