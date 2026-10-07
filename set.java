//hashset and treeset
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {

    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Cherry");
        hashSet.add("Apple");
        System.out.println("HashSet Elements (Unordered, No Duplicates):");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        Set<String> treeSet=new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Apple");
        System.out.println("\nTreeSet Elements (Sorted, No Duplicates):");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

    }
}