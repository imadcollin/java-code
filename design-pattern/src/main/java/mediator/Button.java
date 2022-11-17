package mediator;

public class Button {
    private boolean status;

    void pressUP() {
        status = true;
        System.out.println("Press Up...");
    }

    void pressDown() {

        status = false;
        System.out.println("Press Down...");


    }
}
