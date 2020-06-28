package practise2019;

import java.util.Arrays;

public class _5_numTeams {
    private static int numTeams(int[] rating) {
        int result = 0;
        int length = rating.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (rating[i] < rating[j] && rating[j] < rating[k]) {
                        System.out.println(rating[i] + "<" + rating[j] + "<" + rating[k]);
                        result++;
                    }
                    if (rating[i] > rating[j] && rating[j] > rating[k]) {
                        System.out.println(rating[i] + ">" + rating[j] + ">" + rating[k]);
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }

    private static int numTeams_1(int[] rating) {
        int n = rating.length;
        if (n <= 2) {
            return 0;   //总共没有3个士兵
        }
        int[] minToMax2 = new int[n];     //minToMax2[j]代表,i->j中间有多少数rating[j]小
        int[] maxToMin2 = new int[n];     //maxToMin2[j]代表,i->j中间有多少数rating[j]大
        int i, j, result = 0;
        for (i = 0; i < n; i++) {
            minToMax2[i] = 0;
            maxToMin2[i] = 0;
            for (j = i - 1; j >= 0; j--) {
                if (rating[i] > rating[j]) {
                    minToMax2[i]++;     //计算有多少数比rating[i]小
                    result += minToMax2[j];
                    //rating[i]>rating[j],rating[j]比minToMax2[j]个下标小于j的数大,所以{rating[k](k<j)<rating[j]<rating[i]}共有minToMax2[j种情况]
                    System.out.println(Arrays.toString(minToMax2));
                    System.out.println(result);
                }
                if (rating[i] < rating[j]) {
                    maxToMin2[i]++;
                    result += maxToMin2[j];
                    System.out.println(Arrays.toString(maxToMin2));
                    System.out.println(result);
                }
            }
        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        numTeams_1(x);
        Float s = new Float(0.1f);
        Float t = new Float(0.1f);
        Double u = new Double(0.1);
        System.out.println(u.equals(t));
    }
}
