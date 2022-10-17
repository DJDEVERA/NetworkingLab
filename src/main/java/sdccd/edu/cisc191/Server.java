package sdccd.edu.cisc191;

import java.io.IOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // server listens to server port
        ServerSocket serverSocket = new ServerSocket(5000);

        // accepts socket
        Socket socket = serverSocket.accept();

        // confirms client connection
        System.out.println("Client connected");

        // input stream to receive vehicle requests
        ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());

        // handles vehicle requests from reading input stream object
        VehicleRequest receiveRequest = (VehicleRequest) inStream.readObject();
        // confirms vehicle requests
        System.out.println("Vehicle request received");
        System.out.println(receiveRequest.requested);

        // output stream to send data
        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());

        // writes vehicle response objects
        VehicleResponse vehicleResponse = new VehicleResponse(receiveRequest, 16000, 45000, 4, 4,
                new String[]{"Autopilot", "AWD"});
        outStream.writeObject(vehicleResponse);

        // flush output stream
        outStream.flush();

        // closes server socket
        serverSocket.close();





    }

}
