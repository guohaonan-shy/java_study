package nus.distributed_system.assignment1;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.function.Consumer;

public class Server implements Hello {
    public Server(){
    }

    @Override
    public String sayHello() throws RemoteException {
        Consumer<String> func = System.out::println;
        func.accept("hello world");
        return "server succssful";
    }

    public static void main(String[] args) {
        try {
            Server server = new Server();
            Hello stub =  (Hello) UnicastRemoteObject.exportObject(server,0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("hello_server", stub);

            System.out.println("server start success");
        } catch (Exception e) {
            System.err.println("server start failed" + e);
//            e.printStackTrace();
        }
    }
}
