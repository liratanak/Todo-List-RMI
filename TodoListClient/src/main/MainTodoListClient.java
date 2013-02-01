package main;

import java.rmi.RemoteException;

import action.Client;
import item.TodoItem;

public class MainTodoListClient {

	public static void main(String[] args) {
		try {
			Client client = new Client();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
