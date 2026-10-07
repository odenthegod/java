public class subarray {
    public static void main(String[] args)
    {
        int[] arr = {100,80,40,70,120,90,60};
        int size=3;

        int total=0;
        for(int i=0; i<size; i++)
        {
            total = total + arr[i];
        }

        int max=total;
        for(int i=1; i<=arr.length-size; i++)
        {
            total = total - arr[i-1] + arr[i+size-1];
            max = Math.max(total, max);
        }

        System.out.println("Maximum Sum Subarray : "+max);
    }
}
