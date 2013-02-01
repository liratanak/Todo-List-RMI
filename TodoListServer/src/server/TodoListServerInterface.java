package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import item.TodoItem;

public interface TodoListServerInterface extends Remote {
	
	public TodoItem getTodo(int id) throws RemoteException;
	
	public List<TodoItem> getList(UnicastRemoteObject source) throws RemoteException;
	
	public void disconnect(UnicastRemoteObject source) throws RemoteException;
	
	public int updateTodo(TodoItem item, UnicastRemoteObject source) throws RemoteException;
	
	public boolean deleteTodo(TodoItem ti, UnicastRemoteObject source) throws RemoteException;
}
