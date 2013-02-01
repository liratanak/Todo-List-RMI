package pkinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import item.TodoItem;

public interface TodoListServerInterface extends Remote {
	
	public TodoItemInterface getTodo(int id) throws RemoteException;
	
	public List<TodoItemInterface> getList(UnicastRemoteObject source) throws RemoteException;
	
	public void disconnect(UnicastRemoteObject source) throws RemoteException;
	
	public int updateTodo(TodoItemInterface item, UnicastRemoteObject source) throws RemoteException;
	
	public boolean deleteTodo(TodoItemInterface ti, UnicastRemoteObject source) throws RemoteException;
}
