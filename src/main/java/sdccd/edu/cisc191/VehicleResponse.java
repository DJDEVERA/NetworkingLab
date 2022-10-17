package sdccd.edu.cisc191;

import java.io.Serializable;
import java.util.Arrays;

public class VehicleResponse implements Serializable {

    public String vehicleInfo;
    public VehicleResponse(VehicleRequest request, int miles, int price, int seats, int doors, String[] options){

        // writes vehicleInfo to client
        vehicleInfo = request.requested +
                "\n This vehicle has " + miles + " miles"
                + "\n with " + doors + " doors, and " + seats + " seats."
                + "\n This vehicle also features " + Arrays.toString(options) + "."
                + "\n The price for this vehicle will cost: $" + price + ".";


    }

}
