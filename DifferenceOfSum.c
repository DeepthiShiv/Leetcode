int differenceOfSum(int* nums, int numsSize) {
    int sum1=0,sum2=0;
    for(int i=0;i<numsSize;i++){
        sum1+=nums[i];
        while(nums[i]>0){
            sum2+=nums[i]%10;
            nums[i]/=10;
        }
    }
    return sum1-sum2;
}
