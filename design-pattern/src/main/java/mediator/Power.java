package mediator;

public class Power {
    private boolean connected;

    void plug() {
        this.connected = true;
        System.out.println("Power pluged...");

    }

    void unplug() {
        this.connected = false;
        System.out.println("Power unplugged...");

    }

    public boolean isConnected() {
        return connected;
    }
}
