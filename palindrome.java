import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0,right=s.length()-1;
        boolean ans=true;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                ans=false;
                break;
            }
            right--;
            left++;
        }
        if(ans){
            System.out.println(s+" is a palindrome ");
        }else{
            System.out.println(s+" is not a palindrome");
        }
        sc.close();
    }
}
