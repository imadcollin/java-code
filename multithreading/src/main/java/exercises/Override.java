package exercises;

public class Override extends Thread {

    public void run() {
        System.out.println("Run Method");

    }

    //public void start(){
    //System.out.println("Start Method");
    //}

/*    public void start() {
        System.out.println("Start Method");
        run();
    }
    */
      public void start() {
        System.out.println("Start Method");
        run();
        super.start();
    }

    public static void main(String[] args) {
        Override o = new Override();
        o.start();
        System.out.println("Main Method");
    }
}
