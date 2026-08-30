class Solution {
    public int[] twoSum(int[] nums, int target) {
        // -100 , 100 == 0 
        // Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length; i++){
            // if(map.isEmpty()){
            //     map.put(target-nums[i],i); 
            // }
            if(map.get(nums[i])==null){
                map.put(target-nums[i],i);
            }else{
                return new int[]{ map.get(nums[i]), i };
            }
  
        }
        return new int[]{0,0};
    }
}
