public class RotateArray {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] ans = new int[size];
        // This is mainly based on the modulo property
        int shiftIndex = k % size;
        if( shiftIndex != 0 ){
            int j =0;
            for(int i = size-shiftIndex;i < size;i++){
                ans[j] = nums[i];
                j++;
            }
            for(int i=0;i < size-shiftIndex;i++){
                ans[j] = nums[i];
                j++;
            }
            for(int i =0;i < size;i++){
                nums[i] = ans[i];
            }
        }
    }
    // Prototype Main
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 17;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
