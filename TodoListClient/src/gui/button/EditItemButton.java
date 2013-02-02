package gui.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.panel.TodoItemPanel;

import javax.swing.JButton;

public class EditItemButton extends JButton implements ActionListener {

	private TodoItemPanel todoItemPanel;
	
	public EditItemButton(String title, TodoItemPanel todoItemPanel) {
		super(title);
		this.todoItemPanel = todoItemPanel;
		this.addActionListener(this);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		this.todoItemPanel.getObjectTextArea().setEditable(true);
	}

}
