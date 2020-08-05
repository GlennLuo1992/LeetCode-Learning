package practise2020;

public class _17_balancedStringSplit {
    static public int balancedStringSplit(String s) {
        char[] inputArray = s.toCharArray();
        int count = 0, leftCount = 1;
        char currentChar = inputArray[0];
        for (int cursor = 1; cursor < inputArray.length; cursor++) {
            if (inputArray[cursor] == currentChar) {
                leftCount++;
            }
            if (inputArray[cursor] != currentChar) {
                leftCount--;
                if (leftCount == 0) {
                    count++;
                    if (cursor+1<inputArray.length){
                        currentChar = inputArray[cursor + 1];
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
    }
}
