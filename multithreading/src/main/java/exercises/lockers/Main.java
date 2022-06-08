package exercises.lockers;

public class Main {
    public static void main(String[] args) {
        System.out.println("Synched Objects");
        Worker w = new Worker();
        w.main();

        System.out.println("Synched method");
        Syncaer syncaer = new Syncaer();
        syncaer.main();

    }
}
