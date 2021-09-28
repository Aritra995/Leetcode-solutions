import java.util.Arrays;

public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        for(int i =0;i < nums.length;i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    // prototype main
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        SquaresSortedArray sortedArray = new SquaresSortedArray();
        nums = sortedArray.sortedSquares(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
