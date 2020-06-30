package practise2020;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class _3_Permute {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (len == 0) {
            return result;
        }
        int depth = 0;
        boolean[] used = new boolean[len];
//      双端队列
        Deque<Integer> path = new ArrayDeque<>();
        rsf(nums, depth, len, path, used, result);
        return result;
    }

    private static void rsf(int[] nums, int depth, int len, Deque<Integer> path,boolean[] used, List<List<Integer>> result) {
        if (depth == len) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]){
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            rsf(nums, depth + 1, len, path, used, result);
            path.removeLast();
            used[i] = false;
        }
    }

    public static void main(String[] args) {

    }
}
