package lab2;

public class ThisKeyWord {
     String name;
     int age;

    public ThisKeyWord(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name is:" + name +" age: "+age;
    }

    private void print() {
        System.out.println("name is :"+name+ " age is:"+age);

    }

    public static void main(String[] args) {
        ThisKeyWord th = new ThisKeyWord("Adam", 25);
        ThisKeyWord th2 = new ThisKeyWord("Bob",46);
        System.out.println(th);
        th.print();
        System.out.println(th2);
        th2.print();
    }
}
