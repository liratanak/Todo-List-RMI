package gui.panel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;

public class TodoListMainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private List<TodoItemPanel> listTodoItemPanel;

	public TodoListMainPanel(List<TodoItemPanel> listTodoItemPanel) {
		this.listTodoItemPanel = listTodoItemPanel;
		this.setLayout(new GridLayout(listTodoItemPanel.size(), 1));

		for (TodoItemPanel item : listTodoItemPanel) {
			this.add(item);
		}

	}

	public List<TodoItemPanel> getTodoItemPanel() {
		return listTodoItemPanel;
	}

	public TodoListMainPanel setTodoItemPanel(List<TodoItemPanel> listTodoItemPanel) {
		this.listTodoItemPanel = listTodoItemPanel;
		return this;
	}

}
