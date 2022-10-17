package sdccd.edu.cisc191;

import java.io.IOException;
import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // connects clients socket to port
        Socket socket = new Socket("localhost",5000);

        // output stream to send serialized data
        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());


        // creates vehicle request based on year, manufacturer, and model
        VehicleRequest vehicleRequest = new VehicleRequest(2020, "Tesla", "Model 3");
        outStream.writeObject(vehicleRequest);

        // flushes output stream
        outStream.flush();

        // input stream to receive serialized data
        ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());

        // reads vehicle response from input stream
        VehicleResponse receiveResponse = (VehicleResponse)inStream.readObject();
        System.out.println(receiveResponse.vehicleInfo);

        // closes output stream and socket
        outStream.close();
        socket.close();

    }

}
