package factory;

public class Ak4 extends Weapon {
    private String name;
    private double weight;
    private float range;

    public Ak4() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getRange() {
        return range;
    }

    public void setRange(float range) {
        this.range = range;
    }

    @Override
    public void details() {
        System.out.println("Name: " + name + "\t  Weight:" + weight + "\t Range:" + range);
    }

    @Override
    public boolean requireLicense() {
        return true;
    }
}
