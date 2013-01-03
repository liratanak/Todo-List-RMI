package mapper;

import item.TodoItem;

import java.util.List;

public interface TodoItemMapperInterface {
	public List<TodoItem> findAll();
	public TodoItem findById(int id);
	public boolean addItem(TodoItem todoItem);
	public boolean updateItem(TodoItem todoItem);
	public boolean deleteItem(TodoItem todoItem);
	public boolean deleteItem(int id);
}
