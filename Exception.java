public class Exception{
    public static void main(String[] args){
        int num=10;
        int demo=0;
        try{
            int result=num/demo;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Error , division by 0 not allowed");
        }finally{
            System.out.println("finally block executed");
        }
    }
}