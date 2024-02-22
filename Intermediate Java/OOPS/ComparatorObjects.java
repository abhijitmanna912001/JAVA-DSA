import java.util.ArrayList;
import java.util.Collections;

class myStudent implements Comparable<myStudent> {
    int maxMarks;
    int rollNumber;

    myStudent(int maxMarks, int rollNumber) {
        this.rollNumber = rollNumber;
        this.maxMarks = maxMarks;
    }

    public String toString() {
        String val = "Marks : " + this.maxMarks + " , " + "Roll Number " + this.rollNumber;
        return val;
    }

    public int compareTo(myStudent that) {
        int mark1 = this.maxMarks;
        int mark2 = that.maxMarks;

        if (mark1 == mark2) {
            return this.rollNumber - that.rollNumber;
        }

        return that.maxMarks - this.maxMarks;
    }
}

public class ComparatorObjects {
    public static void main(String[] args) {
        ArrayList<myStudent> arr = new ArrayList<>();
        arr.add(new myStudent(90, 20));
        arr.add(new myStudent(90, 10));
        arr.add(new myStudent(88, 22));
        arr.add(new myStudent(88, 24));
        arr.add(new myStudent(96, 2));
        arr.add(new myStudent(64, 1));

        ComparatorObjects c1 = new ComparatorObjects();
        Collections.sort(arr);
        c1.display(arr);
    }

    public <T> void display(ArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
