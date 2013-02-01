package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import pkinterface.TodoItemInterface;
import pkinterface.TodoListServerInterface;


public class TodoListServer implements TodoListServerInterface{
	List<TodoItemInterface> todoList;
	List<UnicastRemoteObject> clientList;
	
	public List<TodoItemInterface> getTodoList() {
		return todoList;
	}
	public void setTodoList(List<TodoItemInterface> todoList) {
		this.todoList = todoList;
	}
	public List<UnicastRemoteObject> getClientList() {
		return clientList;
	}
	public void setClientList(List<UnicastRemoteObject> clientList) {
		this.clientList = clientList;
	}
	
	@Override
	public TodoItemInterface getTodo(int id) throws RemoteException {
		return this.todoList.get(id);
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
