package main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import action.Client;
import item.TodoItem;

public class MainTodoListClient {

	public static void main(String[] args) {
		try {
			Client client = new Client();
			
			String name = "TodoListServer";
			Registry registry = LocateRegistry.getRegistry("localhost");
			
			
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
