class Solution {
    public void moveZeroes(int[] nums) {
        int z=nums.length;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
            z=i;
            break;
           }
        }
        for(int i=z+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[z];
                nums[z]= temp;
                z++;
            }
        }
    }
}
