package sdccd.edu.cisc191;

import java.io.Serializable;
import java.util.Arrays;

public class VehicleResponse implements Serializable {

    private VehicleRequest request;
    private int miles;
    private int price;
    private int seats;
    private int doors;
    private String[] options;
    public String vehicleInfo;

    public VehicleResponse(VehicleRequest request, int miles, int price, int seats, int doors, String[] options){

        // writes vehicleInfo to client
        vehicleInfo = request.requested +
                "\n This vehicle has " + miles + " miles"
                + "\n with " + doors + " doors, and " + seats + " seats."
                + "\n This vehicle also features " + Arrays.toString(options) + "."
                + "\n The price for this vehicle will cost: $" + price + ".";

    }

    // get and set requests
    public VehicleRequest getRequest(){
        return request;
    }
    public void setRequest(){
        this.request = request;
    }

    // get and set miles
    public int getMiles() {
        return miles;
    }
    public void setMiles(){
        this.miles = miles;
    }

    // get and set price
    public int getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }

    // get and set seats
    public int getSeats(){
        return seats;
    }
    public void setSeats(){
        this.seats = seats;
    }

    // get and set doors
    public int getDoors(){
        return doors;
    }
    public void setDoors(){
        this.doors = doors;
    }
    // get and set options
    public String[] getOptions(){
        return options;
    }
    public void setOptions(){
        this.options = options;
    }

}
