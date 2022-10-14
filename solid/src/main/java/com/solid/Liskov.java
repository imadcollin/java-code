package com.solid;

public class Liskov {

}

class Rectangle {
    private double w;
    private double h;


    public void setW(double w) {
        this.w = w;
    }

    public void setH(double h) {
        this.h = h;
    }


}

class Square extends Rectangle {
    @Override
    public void setH(double h) {
        super.setH(h);
        super.setW(h);
    }

    @Override
    public void setW(double w) {
        super.setW(w);
        super.setW(w);
    }
}
