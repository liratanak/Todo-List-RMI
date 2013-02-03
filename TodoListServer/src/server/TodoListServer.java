package server;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pkinterface.IClient;
import pkinterface.TodoItemInterface;
import pkinterface.TodoListServerInterface;

public class TodoListServer implements TodoListServerInterface {
	Map<Integer, TodoItemInterface> todoList;
	List<IClient> clientList;

	public TodoListServer() {
		this.todoList = new HashMap<Integer, TodoItemInterface>();
		this.clientList = new ArrayList<>();
	}

	public Map<Integer, TodoItemInterface> getTodoList() {
		return todoList;
	}

	public void setTodoList(Map<Integer, TodoItemInterface> todoList) {
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
	public Map<Integer, TodoItemInterface> getList(IClient source) throws RemoteException {
		if (clientList.contains(source)) {
			return this.todoList;
		}
		this.clientList.add(source);
		return this.todoList;
	}

	@Override
	public void disconnect(IClient source) throws RemoteException {
		if(this.clientList.contains(source)){
			this.clientList.remove(source);
		}
	}

	@Override
	public int updateTodo(TodoItemInterface item, IClient source) throws RemoteException {
		System.out.println(item.getObject());

		System.out.println(item.getId());
		for (IClient client : clientList) {
			if(!source.equals(client)){
				client.notifyClient();
			}
		}
		return 0;
	}

	@Override
	public boolean deleteTodo(TodoItemInterface item, IClient source) throws RemoteException {
		if(this.todoList.containsKey(item.getId())){
			this.todoList.remove(item.getId());
			return true;
		}
		return false;
	}

}
