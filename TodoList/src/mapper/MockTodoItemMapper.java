package mapper;

import item.TodoItem;

import java.util.List;
import java.util.Vector;

public class MockTodoItemMapper implements TodoItemMapperInterface {

	@Override
	public List<TodoItem> findAll() {
		
		List<TodoItem> listTodoItems = new Vector<TodoItem>();
		
		listTodoItems.add(new TodoItem());
		
		return listTodoItems;
	}

	@Override
	public TodoItem findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addItem(TodoItem todoItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateItem(TodoItem todoItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItem(TodoItem todoItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItem(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
