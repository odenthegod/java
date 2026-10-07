import java.util.*;
public class array {
    public static void main(String[] args) {
        int[] nums = {12, 45, 67, 45, 67, 23, 89, 89, 34};
        int largest=nums[0],second_largest=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                second_largest=largest;
                largest=nums[i];
                
            }else if(nums[i]>=second_largest && nums[i]<largest){
                second_largest=nums[i];
            }
        }
        System.out.println("largest = "+largest);
        System.out.println("second largest = "+second_largest);
        //ascending order
        String[] name={"Zara", "Alex", "John", "Rahul", "Beatrix"};
        Arrays.sort(name);
        for(String s:name){
            System.out.println(s);
        }
    }
}
