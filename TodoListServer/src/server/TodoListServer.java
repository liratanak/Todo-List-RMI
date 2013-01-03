package server;

import item.TodoItem;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class TodoListServer implements TodoListServerInterface{
	List<TodoItem> todoList;
	List<UnicastRemoteObject> clientList;
	
	@Override
	public TodoItem getTodo(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<TodoItem> getList(UnicastRemoteObject source) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void disconnect(UnicastRemoteObject source) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int updateTodo(TodoItem item, UnicastRemoteObject source) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean deleteTodo(TodoItem ti, UnicastRemoteObject source) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
