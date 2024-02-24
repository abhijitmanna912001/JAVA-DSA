import java.util.*;

public class myList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(7);
        System.out.println(list);
        System.out.println(list.size());
        // list.remove(Integer.valueOf(5));
        // System.out.println(list);
        // list.remove(2);
        // System.out.println(list);
        // System.out.println(list.contains(7));
        // System.out.println(list.get(0));
        // System.out.println(list.set(0, 9));
        // System.out.println(list);

        Iterator<Integer> itr = list.iterator();
        System.out.println("My list -->");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}