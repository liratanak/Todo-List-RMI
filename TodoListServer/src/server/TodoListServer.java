package server;

import item.TodoItem;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import pkinterface.TodoItemInterface;
import pkinterface.TodoListServerInterface;


public class TodoListServer implements TodoListServerInterface{
	List<TodoItem> todoList;
	List<UnicastRemoteObject> clientList;
	@Override
	public TodoItemInterface getTodo(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<TodoItemInterface> getList(UnicastRemoteObject source) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void disconnect(UnicastRemoteObject source) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int updateTodo(TodoItemInterface item, UnicastRemoteObject source) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean deleteTodo(TodoItemInterface ti, UnicastRemoteObject source) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	
}
