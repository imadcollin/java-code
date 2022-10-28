package builder;

public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.SetFirst_name("Tat").SetLast_name("Olle").SetAge(20).SetId(1).build();
        System.out.println(studentBuilder);
    }
}
