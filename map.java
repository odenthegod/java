//hashmap and linkedhashmap
import java.util.*;

public class map {

    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        System.out.println("\nTreeSet Elements (Sorted, No Duplicates):");
        hashMap.put(103, "Charlie");
        hashMap.put(101, "Alice");
        hashMap.put(102, "Bob");
        hashMap.put(101, "Alice Updated");
        hashMap.put(105,"alice");

        System.out.println("HashMap Elements (No Guaranteed Order):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(103, "Charlie");
        linkedHashMap.put(101, "Alice");
        linkedHashMap.put(102, "Bob");
        linkedHashMap.put(101, "Alice Updated");

        System.out.println("\nLinkedHashMap Elements (Insertion Order Maintained):");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }



    }
}