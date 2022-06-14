package serialzation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Seriali implements Serializable {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seriali(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;
    private transient int SN;

    public void checkName() {
        System.out.println("Testing to send data.." + name);
    }

    public static void main(String[] args) {
        Seriali seriali = new Seriali(1, "Student 1 ");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(seriali);
            out.close();
            System.out.println("Saved....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
