package main;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import pkinterface.TodoListServerInterface;

import action.Client;

public class MainTodoListClient {

	public static void main(String[] args) {
		try {
//			Client client = new Client();
//			System.setSecurityManager(new SecurityManager());
			
			String name = "TodoListServer";
			Registry registry = LocateRegistry.getRegistry("localhost");
			TodoListServerInterface serverObject = (TodoListServerInterface) registry.lookup(name);

			System.out.println(serverObject.getTodo(0).getTitle());

		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}
