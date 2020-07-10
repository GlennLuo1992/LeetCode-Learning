package SortAlgorithm;

import java.util.Arrays;

public class Bubbling {
    private static int[] sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                int tem = 0;
                if (array[j]>array[j+1]){
                    tem = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tem;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,6,3,9,2,1,7};
        System.out.println(Arrays.toString(sort(array)));
    }
}
