public class binary_search {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int n=9;
        int elem =30;
        int start=0;
        int end=n-1;
        boolean found=false;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==elem){
                System.out.println("element found");
                found=true;
                break;
            }else{
                if(arr[mid]>elem){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        if(!found){
            System.out.println("element doesnt exist");
        }
    }
}
