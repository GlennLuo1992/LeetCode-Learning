package practise2020;

import java.util.ArrayList;
import java.util.List;

public class _14_decompressRLElist {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 1; i < nums.length; i+=2) {
            int count = nums[i-1];
            int val = nums[i];
            for (int j = 0; j < count; j++) {
                resultList.add(val);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
