// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n<2){
            System.out.println(n+" is not a prime");
        }
        boolean isflag=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println(n + " is not a prime");
                isflag=false;
                break;
            }
        }
        if(isflag){
            System.out.println(n + " is a prime");
        }
    }
}