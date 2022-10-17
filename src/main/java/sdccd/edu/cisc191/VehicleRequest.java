package sdccd.edu.cisc191;

import java.io.Serializable;

public class VehicleRequest implements Serializable {

    private int year;
    private String make;
    private String model;
    public String requested;

    public VehicleRequest(int year, String make, String model){

        // client request for vehicle year, manufacturer, and model
        requested = "You have requested: " + year + " " + make + " " + model + ".";

    }

    // get and set year
    public int getYear() {
        return year;
    }
    public void setYear() {
        this.year = year;
    }

    // get and set model
    public String getModel() {
        return model;
    }
    public void setModel() {
        this.model = model;
    }

    // get and set make
    public String getMake() {
        return make;
    }
    public void setMake() {
        this.make = make;
    }

}
