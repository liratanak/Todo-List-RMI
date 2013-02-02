package gui.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.panel.TodoItemPanel;

import javax.swing.JButton;

public class SaveItemButton extends JButton implements ActionListener {

	private TodoItemPanel todoItemPanel;
	
	public SaveItemButton(String title, TodoItemPanel todoItemPanel) {
		super(title);
		this.todoItemPanel = todoItemPanel;
		this.addActionListener(this);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
