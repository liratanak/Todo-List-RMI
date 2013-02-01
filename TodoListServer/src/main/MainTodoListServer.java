package main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import server.TodoListServer;
import server.TodoListServerInterface;

public class MainTodoListServer {

	public static void main(String[] args) {
		try {
			TodoListServerInterface server = new TodoListServer();

			String name = "TodoListServer";

			TodoListServerInterface stub = (TodoListServerInterface) UnicastRemoteObject.exportObject(server, 0);
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind(name, stub);
			System.out.println("Todo List Server Started!");

		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}