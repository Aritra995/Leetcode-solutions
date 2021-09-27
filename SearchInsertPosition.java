class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int ans = BinarySearch(0, nums.length-1, nums, target);
        return ans;
    }
    public static int BinarySearch(int l,int r,int[] nums,int target){
        if( r >= l ){
            int mid = l + (r-l) / 2;
            if( nums[mid] == target ){
                return mid;
            }
            if( nums[mid] > target){
                return BinarySearch(l, mid-1, nums, target);
            }
            return BinarySearch(mid+1, r, nums, target);
        }
        return l;
    }
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        SearchInsertPosition search = new SearchInsertPosition();
        System.out.println( search.searchInsert(nums, target) );
    }
}