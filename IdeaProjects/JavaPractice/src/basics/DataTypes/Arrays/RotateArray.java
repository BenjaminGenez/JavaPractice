package basics.DataTypes.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int n) {
        n = n % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, n - 1);
        reverse(nums, n, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

}
