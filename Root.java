public class Root {
    public static void main(String[] args) {
        double a=1,b=-5,c=6;
        double d=b*b-(4*a*c);
        if(d>0){
            double root1=(-b+d)/(2*a);
            double root2=(-b-d)/(2*a);
            System.out.println("root1 "+root1+" root2 "+root2);
        }else if(d==0){
            double root=-b/(2*a);
            System.out.println("root is "+root);
        }else{
            System.out.println("NO real roots");
        }
    }
}
