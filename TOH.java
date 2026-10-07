public class TOH{
    public static void solveHanoi(int n,char source,char destination,char helper){
        if (n==1){
            System.out.println("Move disk from "+source+" to "+destination);
            return ;
        }
        solveHanoi(n-1,source,helper,destination);
        System.out.println("Move disk "+n+" from "+source+" to  "+destination);
        solveHanoi(n-1, helper, destination, source);
    }
    public static void main(String[] args){
        int numDisk=2;
        //a source c destination b helper
        solveHanoi(numDisk,'a','c','b');
    }
}