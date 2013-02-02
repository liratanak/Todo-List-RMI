package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import pkinterface.IClient;
import pkinterface.TodoItemInterface;
import pkinterface.TodoListServerInterface;


public class TodoListServer implements TodoListServerInterface{
	List<TodoItemInterface> todoList;
	List<IClient> clientList;
	
	public List<TodoItemInterface> getTodoList() {
		return todoList;
	}
	public void setTodoList(List<TodoItemInterface> todoList) {
		this.todoList = todoList;
	}
	public List<IClient> getClientList() {
		return clientList;
	}
	public void setClientList(List<IClient> clientList) {
		this.clientList = clientList;
	}
	
	@Override
	public TodoItemInterface getTodo(int id) throws RemoteException {
		return this.todoList.get(id);
	}
	@Override
	public List<TodoItemInterface> getList(IClient source) throws RemoteException {
		for (IClient client : clientList) {
			
		}
		return this.todoList;
	}
	@Override
	public void disconnect(IClient source) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int updateTodo(TodoItemInterface item, IClient source) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean deleteTodo(TodoItemInterface ti, IClient source) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	
}
