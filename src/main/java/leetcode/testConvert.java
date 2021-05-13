package leetcode;

class user{
    private String name;

    public user() {
        System.out.println("Bang .");
    }

    public user(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class suser extends  user{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class testConvert {
    public static void main(String[] args) {

        user u = new user("abc");
        suser s = new suser();
       // System.out.println(s.getAge());
    }
}
