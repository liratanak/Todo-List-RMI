package gui.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.panel.TodoItemPanel;

import javax.swing.JButton;

public class EditItemButton extends JButton implements ActionListener {

	private TodoItemPanel todoItemPanel;
	private boolean beingEdited = false;

	public boolean isBeingEdited() {
		return beingEdited;
	}

	public void setBeingEdited(boolean beingEdited) {
		this.beingEdited = beingEdited;
	}

	public EditItemButton(String title, TodoItemPanel todoItemPanel) {
		super(title);
		this.todoItemPanel = todoItemPanel;
		this.addActionListener(this);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.beingEdited) {
			this.todoItemPanel.getObjectTextArea().setEditable(false);
			this.todoItemPanel.getObjectTextArea().setText(this.todoItemPanel.getTodoItem().getObject());
			this.setText("Edit");
			this.todoItemPanel.getSaveButton().setEnabled(false);
			this.beingEdited = false;
		} else {
			this.todoItemPanel.getObjectTextArea().setEditable(true);
			this.todoItemPanel.getSaveButton().setEnabled(true);
			this.setText("Cancel");
			this.beingEdited = true;
		}
	}

}
