import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] nums = {7,6,5,4,3,2,1,0};
        Quick(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void Quick(int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s +(e-s)/2;
        int p = nums[m];

        while (s <=e ){
            while (nums[s] < p){
                s++;
            }
            while (nums[e] > p){
                e--;
            }
            if (s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        Quick(nums,low,e);
        Quick(nums,s,high);
    }
}
