package server;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import item.TodoItem;

public interface TodoListServerInterface {
	public TodoItem getTodo(int id);
	public List<TodoItem> getList(UnicastRemoteObject source);
	public void disconnect(UnicastRemoteObject source);
	public int updateTodo(TodoItem item, UnicastRemoteObject source);
	public boolean deleteTodo(TodoItem ti, UnicastRemoteObject source);
}
