package main;

import item.TodoItem;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import pkinterface.TodoItemInterface;
import pkinterface.TodoListServerInterface;

import server.TodoListServer;

public class MainTodoListServer {

	public static void main(String[] args) {
		try {
//			System.setSecurityManager(new SecurityManager());
			
			TodoListServerInterface server = new TodoListServer();

			((TodoListServer) server).setTodoList(new ArrayList<TodoItemInterface>());
			
			((TodoListServer) server).getTodoList().add(((TodoItemInterface)(new TodoItem(1, 1, 2, "Title 1", "Object of title 1"))));
			((TodoListServer) server).getTodoList().add(((TodoItemInterface)(new TodoItem(2, 1, 2, "Title 2", "Object of title 2"))));

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