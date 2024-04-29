package medium;

import static medium.RemoveDuplicatesValue.removeDuplicates;

public class RemoveDuplicatesValue {

    public static   void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public static int  removeDuplicates(int[] nums){

         int j=1;
         for (int i=1;i<nums.length;i++){
            if(j==1 ||nums[i] != nums[j-2]){
             nums[j++]=nums[i];
            }
        }
        return j;
    }
}
