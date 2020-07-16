package practise2020;

import java.util.ArrayList;
import java.util.List;

public class _13_createTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int length = index.length;
        for (int i = 0; i < length; i++) {
            int numsIndex = index[i];
            int numValue = nums[i];
            list.add(numsIndex, numValue);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
