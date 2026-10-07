public class maxWater {
    public static void main(String[] args) {
        int[] nums={1, 8, 6, 2, 5, 4, 8, 3, 7,19};
        int n=nums.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right){
            int width=Math.abs(right-left);
            int height = Math.min(nums[left], nums[right]); 
            int vol=height*width;
            max=Math.max(max, vol);
            if(nums[left]<nums[right]) left++;
            else right--;
        }
        System.out.println(max);
    }
}
