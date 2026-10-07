import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Apna College");
        // System.out.println(sb);

        // StringBuilder sb = new StringBuilder("Tony");
        // //Set Char
        // System.out.println(sb.charAt(3));

        //insertion at a certain position
        // StringBuilder sb = new StringBuilder("tony");
        // //Insert char
        // sb.insert(0, 'S');
        // System.out.println(sb);

        //StringBuilder sb = new StringBuilder("tony");
        //Insert char
        //sb.insert(0, 'S');
        //System.out.println(sb);
        //stony


	//delete char
        //sb.delete(0, 1);
        //System.out.println(sb);//tony

        //append 
    //     StringBuilder sb = new StringBuilder("Tony");
    //  sb.append(" Stark");
    //  System.out.println(sb);
    //     StringBuilder sb = new StringBuilder("Tony");
    //  sb.append(" Stark");
    //  System.out.println(sb); 


    //  System.out.println(sb.length());
        StringBuilder sb = new StringBuilder("HelloWorld");
    
     for(int i=0; i<sb.length()/2; i++) {
       int front = i;
       int back = sb.length() - i - 1;


       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);


       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }


     System.out.println(sb);
    }
}
