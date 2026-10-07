import java.util.*;
public class string{
    public static void main(){
    String str = "Hello";
    System.out.println("--- 1. String Operations ---");
    System.out.println("Original String: " + str);
    str.concat(" World"); // Attempt to modify
    System.out.println("After concat() without reassigning: " + str); // Unchanged
    str = str.concat(" World"); // Reassigning
    System.out.println("After reassigning concat(): " + str);
    System.out.println("Uppercase: " + str.toUpperCase());
    System.out.println("Substring (0-5): " + str.substring(0, 5));


    StringBuffer sbf=new StringBuffer("java");
    System.out.println("\n--- 2. StringBuffer Operations ---");
    System.out.println("Original StringBuffer: " + sbf);
    sbf.append(" Programming");
    System.out.println("After append(): " + sbf);
    sbf.insert(4, " Standard");
    System.out.println("After insert(): " + sbf);
    sbf.reverse();


    StringBuilder sbd = new StringBuilder("Object");
    System.out.println("\n--- 3. StringBuilder Operations ---");
    System.out.println("Original StringBuilder: " + sbd);
    sbd.append(" Oriented");
    System.out.println("After append(): " + sbd);
    sbd.replace(0, 6, "Class");
    System.out.println("After replace(): " + sbd);
    sbd.delete(5, 14);
    System.out.println("After delete(): " + sbd);

    }
}