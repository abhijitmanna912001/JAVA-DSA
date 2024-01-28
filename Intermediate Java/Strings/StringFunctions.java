public class StringFunctions {
    public static void main(String[] args) {
        String str = "Abhijit Manna";
        // System.out.println(str.toLowerCase());
        // System.out.println(str);
        // System.out.println(str.toUpperCase());
        // System.out.println(str.charAt(0));
        // System.out.println(str.indexOf("n"));
        // System.out.println(str.lastIndexOf("n"));
        // System.out.println(str.length());

        // char ch[] = str.toCharArray();
        // for (int i = 0; i < ch.length; i++) {
        // System.out.print(ch[i] + " ");
        // }

        // System.out.println("Abhijit".compareTo("Abhi"));
        // System.out.println("Abhi".compareTo("Abhijit"));
        // System.out.println("Abhijit".compareTo("Abhijit"));
        // System.out.println("Sbhijit".compareTo("Abhijit"));

        // System.out.println(" Abhijit ");
        // System.out.println(" Abhijit ".trim());
        // System.out.println("Abhijit".startsWith("A"));
        // System.out.println("Abhijit".endsWith("t"));

        // System.out.println("abhijit".substring(3, 3));

        // String myLocations = "hyderabad, chennai, bengalore, noida, pune";
        // String myArray[] = myLocations.split(",");

        // for (int i = 0; i < myArray.length; i++) {
        // System.out.print(myArray[i] + " ");
        // }

        // String email1 = "abhijitmanna912001@gmail.com";
        // String email2 = "abhijitmanna912001@hotmail.com";

        // String emailArr[] = email1.split("@");
        // String lastPart = emailArr[emailArr.length - 1];

        // int dotIndex = lastPart.lastIndexOf('.');

        // System.out.println(lastPart.substring(0, dotIndex));

        StringBuilder name1 = new StringBuilder("abhijit");
        StringBuilder name2 = new StringBuilder("Shashwat");
        StringBuilder name3 = new StringBuilder("Shashwat");
        StringBuilder name4 = name1;

        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name4));
        System.out.println(name4.equals(name2));
        System.out.println(name1.equals(name4));

        name4.append("tiwari");

        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name4));
        System.out.println(name4.equals(name2));
        System.out.println(name1.equals(name4));
    }
}
