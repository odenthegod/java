import java.util.ArrayList;
import java.util.List;

public class ex_sw {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int size = 3;
        List<Integer> result = new ArrayList<>();
        
        for (int i=0;i<=arr.length-size;i++){
            int current_max=arr[i];
            for(int j=i;j<i+size;j++){
                if(arr[j]>current_max){
                    current_max=arr[j];
                }
            }
            result.add(current_max);
        }
        System.out.println("Maximums stored in list: " + result);
    }   
}
