package facade;

public class Destination {
    private String name;
    private float distance;

    public Destination(String name, float distance) {
        this.name = name;
        this.distance = distance;
    }

    private boolean isInRange() {
        return true;
    }

    private boolean isSafe() {
        return true;
    }

    private void goeInfo() {
        System.out.println("The destination planet is clean... ");
    }

    public boolean  destenationStatus(){
        if(isSafe() && isInRange()){
            goeInfo();
            return true;
        }
        return false;
    }
}
