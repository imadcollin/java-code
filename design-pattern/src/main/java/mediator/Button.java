package mediator;

public class Button {
    private boolean on;

    void pressUP() {
        on = true;
        System.out.println("Press Up...");
    }

    void pressDown() {
        on = false;
        System.out.println("Press Down...");
    }

    public boolean isButtonON() {
        return on;
    }
}
