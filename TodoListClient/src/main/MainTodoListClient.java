package main;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import action.Client;

import pkinterface.IClient;
import pkinterface.TodoListServerInterface;

public class MainTodoListClient {

	public static void main(String[] args) {
		try {
			IClient client = new Client();
//			System.setSecurityManager(new SecurityManager());

			String name = "TodoListServer";
			Registry registry = LocateRegistry.getRegistry("localhost");
			TodoListServerInterface serverObject = (TodoListServerInterface) registry.lookup(name);

			System.out.println(serverObject.getList(client));

		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
