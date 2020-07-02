package practise2020;

public class _6_sortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        int headIndex = 0;
        int endIndex = A.length - 1;
        int[] result = new int[A.length];
        for (int value : A) {
            if (value % 2 == 0) {
                result[headIndex] = value;
                headIndex++;
            } else {
                result[endIndex] = value;
                endIndex--;
            }
        }
        for (int i = 0; i < A.length / 2; i++) {
            if (i % 2 != 0) {
                int tem = result[A.length - i - 1];
                result[A.length - i - 1] = result[i];
                result[i] = tem;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{4, 2, 5, 7};
        int[] out = sortArrayByParityII(input);
        for (int i : out) {
            System.out.println(i);
        }
    }
}
