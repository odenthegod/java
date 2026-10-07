import java.util.*;
public class add_recursion {
    public static int add(int a,int b){
        if(b==0){
            return a;
        }
        if(b<0){
            return add(a-1,b+1);
        }
        return add(a+1,b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a : ");
        int a=sc.nextInt();
        System.out.println("enter value b: ");
        int b=sc.nextInt();
        
        System.out.println(add(a,b));
        sc.close();
    }
}
