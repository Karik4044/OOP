package human;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("K", "156", "IT", 2024, 5.6);
        Staff t1 = new Staff("H", "555", "VKU", 5555);
        System.out.println(s1);
        System.out.println(t1);

        s1.setProgram("CE");
        System.out.println(s1.getProgram());
    }
}