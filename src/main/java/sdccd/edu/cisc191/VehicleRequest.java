package sdccd.edu.cisc191;

import java.io.Serializable;

public class VehicleRequest implements Serializable {

    public String requested;
    public VehicleRequest(int year, String manufacturer, String model){

        // client request for vehicle year, manufacturer, and model
        requested = "You have requested: " + year + " " + manufacturer + " " + model + ".";

    }



}
