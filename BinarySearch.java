class Solution {
    public int search(int[] nums, int target) {
        int size = nums.length;
        int left = 0,right= size-1;
        int ans = BinarySearch(left, right, target, nums);
        return ans;
    }
    public static int BinarySearch(int left,int right,int target,int nums[]){
        if( right >= left ){
            int mid = left + (right-left) / 2;
            
            if( target < nums[mid] ){
                //towards left
                return BinarySearch(left, mid-1, target, nums);
            }
            if( nums[mid] == target ){
                //return mid
                return mid;
            }
            return BinarySearch(mid+1, right, target, nums);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        Solution solution = new Solution();
        System.out.println( solution.search(nums, target) );
    }
}