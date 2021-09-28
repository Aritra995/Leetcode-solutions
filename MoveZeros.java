public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i =0;i < nums.length;i++){
            if( nums[i] != 0 ){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index;i < nums.length;i++){
            nums[i] = 0;
        }
    }
    //Prototype Main
    public static void main(String[] args) {
        int nums[] = {0,11,23,9,6,0,1};
        MoveZeros moveZeros = new MoveZeros();
        moveZeros.moveZeroes(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
