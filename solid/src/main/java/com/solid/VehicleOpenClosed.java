package com.solid;

abstract public class VehicleOpenClosed {

    /*

    double calSpeed(VehicleOpenClosed v) {
        if (v instanceof Car) {
            return 10.0;
        } else if (v instanceof Bike) {
            return 5.0;
        } else return 0.0;

    }
     */

    // Applying Open Closed concept the result will be as following:

    abstract double calSpeed(VehicleOpenClosed v);
}

