import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server implements Runnable{

    private ArrayList<ConnectionHandler> connectionsList;
    private ServerSocket server;
    private boolean done = false;
    private ExecutorService pool;

    public Server(){ // initialize ArrayList
        connectionsList = new ArrayList<>();
        done = false;
    }

    @Override
    public void run() {
        try {
            server = new ServerSocket(9999);
            pool = Executors.newCachedThreadPool();
            while(!done) { // to keep accepting connections
                Socket client = server.accept(); // when accepting a connection we get a socket
                ConnectionHandler handler = new ConnectionHandler(client);
                connectionsList.add(handler);
                pool.execute(handler);
            }
        } catch (Exception e) { // shut down no matter what the exception is
            //e.printStackTrace();
            shutdown();
        }
    }

    public void broadcast(String message){ // to everyone
        for (ConnectionHandler ch: connectionsList){
            if(ch != null){
                ch.sendMessage(message);
            }
        }
    }

    public void shutdown(){
        done = true;
        if(!server.isClosed()){
            try {
                server.close();
                for(ConnectionHandler ch: connectionsList){
                    ch.shutdown();
                }
            } catch (IOException e) {
                //e.printStackTrace();
            }
        }
    }

    class ConnectionHandler implements Runnable{
        private Socket client;
        private BufferedReader in; // get this from the socket
        private PrintWriter out; // when writing smth to the client
        private String username;

        public ConnectionHandler(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            try{
                out = new PrintWriter(client.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                out.println("Enter a username: "); // saying thi to the client
                username = in.readLine(); // getting the reply from the client
                System.out.println(username + " is connected"); // for us to see

                //if(username.isBlank() || username.isEmpty()) // if you want to

                broadcast(username + " joined the chat");
                String message = null;
                while ((message = in.readLine()) != null){ // so it will keep asking for a message
                    if (message.startsWith("/user ")){
                        String[] messageSplit = message.split(" ", 2); // everything after the space is going to be a username
                        if (messageSplit.length == 2){
                            broadcast(username + " renamed themselves to " + messageSplit[1]);
                            System.out.println(username + " renamed themselves to " + messageSplit[1]); // for us to see
                            username = messageSplit[1];
                            out.println("Username has been changed to " + username);
                        }
                    }
                    else if (message.startsWith("/quit")){
                        broadcast(username + " left the chat");
                    }
                    else{
                        broadcast(username + ": " + message);
                    }
                }

            } catch(IOException e) {
                shutdown();
            }

        }

        public void sendMessage(String message){
            out.println(message);
        }

        public void shutdown (){
            try {
                in.close();
                out.close();
                if(!client.isClosed()){
                    client.close();
                }
            } catch (IOException e) {
                //e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) { // fist run Server and then Client in multiple cmds
        Server server = new Server();
        server.run();
    }
}
