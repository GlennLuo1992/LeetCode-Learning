package practise2020;

public class _2_SortArrayByParity {
    private static int[] sortArrayByParity(int[] A) {
        int headIndex = 0;
        int endIndex = A.length - 1;
        int[] result = new int[A.length];
        for (int value : A) {
            if (value % 2 == 0) {
                result[headIndex] = value;
                headIndex++;
            }else{
                result[endIndex] = value;
                endIndex--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = new int[]{3,1,2,4};
        int[] result = sortArrayByParity(a);
        for (int i : result) {
            System.out.println(i);
        }

     }
}
