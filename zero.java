public class zero {
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,0,1};
        int left=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==1){
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
                left++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//two pointers
