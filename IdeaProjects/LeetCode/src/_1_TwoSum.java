import java.util.Arrays;

public class _1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++){
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target){
                return new int[] {i, j};
            }

        }
    }
    return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int n = 9;
        System.out.println(Arrays.toString(twoSum(nums, n)));

    }
}
