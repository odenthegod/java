//linkedlist and arraylist

import java.util.*;
public class list{
    public static void main(String[] args){
        List<String> arraylist=new ArrayList<>();
        arraylist.add("sunil");
        arraylist.add("aditya");

        System.out.println("ArrayList Elements:");
        for(String s:arraylist){
            System.out.println(s);
        }
        System.out.println("element at position 1 is "+arraylist.get(0));

        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(2);
        ll.add(3);
        ll.add(6);
        ll.remove(2);//index
        ll.add(8);
        System.out.println("\nLinkedList Elements:");
        for(int i:ll){
            System.out.println(i);
        }
    }
}