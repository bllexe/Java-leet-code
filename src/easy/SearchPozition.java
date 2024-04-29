package easy;

public class SearchPozition {

    public static void main(String[] args) {
       
        int [] nums={1,3,5,6};
        int target=1;
        int result= searchInsert(nums,target);
        System.out.println(result);

    }

    private static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
    
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    
        return low;
    }
}
