package practise2020;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * <p>
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _7_findDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1};
        List<Integer> result = findDisappearedNumbers_best(nums);
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    //  桶子算法
    public static List<Integer> findDisappearedNumbers_best(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] tong = new int[nums.length + 1];
        for (int num : nums) {
            tong[num]++;
        }
        for (int i = 1; i < tong.length; i++) {
            if (tong[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }


//    超时喽~
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<Integer> numsList = new ArrayList<>();
        int len = 0;
        for (int num : nums) {
            numsList.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!numsList.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
