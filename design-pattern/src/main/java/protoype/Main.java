package protoype;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("adam", "sthlm", 2000);
        e1.printRecord();

        Employee e2 = (Employee) e1.getGlone();
        e2.printRecord();

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
