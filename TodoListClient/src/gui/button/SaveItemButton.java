package gui.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import gui.panel.TodoItemPanel;

import javax.swing.JButton;

import main.MainTodoListClient;

public class SaveItemButton extends JButton implements ActionListener {

	private TodoItemPanel todoItemPanel;
	
	public SaveItemButton(String title, TodoItemPanel todoItemPanel) {
		super(title);
		this.setEnabled(false);
		this.todoItemPanel = todoItemPanel;
		this.addActionListener(this);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			this.todoItemPanel.getTodoItem().setObject(this.todoItemPanel.getObjectTextArea().getText());
			
			MainTodoListClient.serverObject.updateTodo(this.todoItemPanel.getTodoItem(), MainTodoListClient.client);
			this.setEnabled(false);
			this.todoItemPanel.getEditButton().setText("Edit");
			((EditItemButton)this.todoItemPanel.getEditButton()).setBeingEdited(false);
			this.todoItemPanel.getObjectTextArea().setEditable(false);
		} catch (RemoteException re) {
			re.printStackTrace();
		}
	}

}
