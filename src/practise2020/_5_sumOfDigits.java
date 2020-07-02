package practise2020;

public class _5_sumOfDigits {
    public static int sumOfDigits(int[] A) {
        int min = getMin(A);
        int sum = getSumOfDigits_1(min);
        System.out.println(sum);
        return sum % 2 == 0 ? 1 : 0;
    }

//  看起来用这种方法看起来好像优雅了一些
    private static int getSumOfDigits_1(int value) {
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value = value / 10;
        }
        return sum;
    }

    private static int getSumOfDigits_2(int min) {
        int sum = 0;
        String s = String.valueOf(min);
        for (int i = 0; i < s.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += digit;
        }
        return sum;
    }

    private static int getMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] input = new int[]{34, 23, 12, 24, 75, 33, 54, 545};
        System.out.println(sumOfDigits(input));
    }
}
