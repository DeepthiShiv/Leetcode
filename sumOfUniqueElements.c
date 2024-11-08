int sumOfUnique(int* nums, int numsSize) {
    int sum=0;
    int count[256];
    for(int i=0;i<numsSize;i++){
        count[nums[i]]++;
    }
    for(int i=0;i<numsSize;i++){
        if(count[nums[i]]==1){
            sum+=nums[i];
        }
    }
    return sum;
}
