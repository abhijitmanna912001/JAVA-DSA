import java.util.*;

public class mySet {
    public static void main(String[] args) {
        Set<Integer> mySet = new LinkedHashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        System.out.println(mySet);
        // System.out.println(mySet.contains(4));
        // System.out.println(mySet.remove(1));
        // System.out.println(mySet);

        Iterator<Integer> itr = mySet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
