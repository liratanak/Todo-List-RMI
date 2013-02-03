package pkinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

public interface TodoListServerInterface extends Remote {
	
	public TodoItemInterface getTodo(int id) throws RemoteException;
	
	public Map<Integer, TodoItemInterface> getList(IClient source) throws RemoteException;
	
	public void disconnect(IClient source) throws RemoteException;
	
	public int updateTodo(TodoItemInterface item, IClient source) throws RemoteException;
	
	public boolean deleteTodo(TodoItemInterface ti, IClient source) throws RemoteException;
}
