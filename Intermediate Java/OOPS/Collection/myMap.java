import java.util.*;

public class myMap {
    public static void main(String[] args) {
        Map<Integer, String> classMap = new LinkedHashMap<>();
        classMap.put(1, "Abhijit");
        classMap.put(2, "Ayush");
        System.out.println(classMap);
        classMap.putIfAbsent(3, "Param");
        System.out.println(classMap);
        classMap.putIfAbsent(4, "Divya");
        System.out.println(classMap);
        classMap.putIfAbsent(5, "Aayushi");
        System.out.println(classMap);
        System.out.println(classMap.getOrDefault(4, "No one"));
        System.out.println(classMap.containsKey(4));
        System.out.println(classMap.containsValue("abhijit"));

        for (Map.Entry<Integer, String> entry : classMap.entrySet()) {
            System.out.print("Key: " + entry.getKey());
            System.out.println(" Value: " + entry.getValue());
        }

        // for (Integer key : classMap.keySet()) {
        // System.out.println("Key: " + key);
        // }

        for (String value : classMap.values()) {
            System.out.println("Value: " + value);
        }
    }
}
