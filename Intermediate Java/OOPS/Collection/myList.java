import java.util.*;

class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

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
        ListIterator<Integer> itr1 = list.listIterator();

        System.out.println("My list -->");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("My list -->");

        while (itr1.hasNext()) {
            System.out.println(itr.next());

            if (itr1.hasPrevious()) {
                System.out.println(itr1.previous());
                break;
            }
        }

        list.sort(new Comparator<Integer>() {
            public int compare(Integer A, Integer B) {
                return A - B;
            }
        });

        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(10, "Abhijit"));
        list1.add(new Student(5, "Madhukar"));
        list1.add(new Student(5, "Ritwika"));
        list1.add(new Student(15, "Ishraaj"));

        list1.sort(new Comparator<Student>() {
            public int compare(Student A, Student B) {
                int res = B.rollNumber - A.rollNumber;
                if (res == 0) {
                    return B.name.compareTo(A.name);
                }
                return res;
            }
        });
        System.out.println(list1);
    }
}