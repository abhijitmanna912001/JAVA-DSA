class ReadOnly {
    private int age;
    private String name;

    ReadOnly() {
        this.age = 23;
        this.name = "Abhijit";
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}

class WriteOnly {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ReadAndWrite {
    private int age;
    private String name;

    ReadAndWrite() {
        this.age = 1;
        this.name = "Abhijit";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class GettersSetters {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        rw.setName("Ajay");
        System.out.println(rw.getName());
        System.out.println(rw.getAge());

        ReadOnly re = new ReadOnly();
        System.out.println(re.getName());
        
        WriteOnly wo = new WriteOnly();
        wo.setAge(36);
    }

}
