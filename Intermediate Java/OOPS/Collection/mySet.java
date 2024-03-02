import java.util.*;

public class mySet {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(1);
        mySet.add(1);
        mySet.add(1);
        mySet.add(1);
        System.out.println(mySet);
        System.out.println(mySet.contains(4));
        System.out.println(mySet.remove(1));
        System.out.println(mySet);
    }
}
