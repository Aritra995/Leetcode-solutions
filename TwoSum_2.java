import java.util.HashMap;

public class TwoSum_2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        HashMap<String,Integer> hashMap = new HashMap<>();
        
        for(int i =0;i < numbers.length;i++){
            if( hashMap.containsKey(""+numbers[i]) ){
                Integer a = hashMap.get(""+numbers[i])+1;
                ans[0] = a;
                ans[1] = i+1;
            }
            else{
                int complement = target-numbers[i];
                hashMap.put(""+complement+"", i);
            }
        }
        return ans;
    }
    //Prototype Main
    public static void main(String[] args) {
        int nums[] = {-1,0};
        int target = -1;
        TwoSum_2 twosum= new TwoSum_2();
        int ans[] = twosum.twoSum(nums, target);
        for (int i : ans) {
            ConsoleLogger.writeInfo(i);
        }
    }
}
