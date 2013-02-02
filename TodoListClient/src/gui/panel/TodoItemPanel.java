package gui.panel;

import gui.button.EditItemButton;
import gui.button.SaveItemButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.DateFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import pkinterface.TodoItemInterface;

public class TodoItemPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private TodoItemInterface todoItem;
	private JTextArea objectTextArea;
	private JPanel southPanel;

	private JButton editButton;
	private JButton saveButton;

	private JLabel lastUpdateLabel;
	private JLabel deadlineLabel;
	private JLabel versionLabel;

	public TodoItemPanel(TodoItemInterface todoItem) {

		this.setPreferredSize(new Dimension(60,90));
		this.setSize(new Dimension(60,90));
		this.setLayout(new BorderLayout());

		this.todoItem = todoItem;
		this.objectTextArea = new JTextArea(todoItem.getObject());
		this.objectTextArea.setEditable(false);
		this.add(objectTextArea, BorderLayout.CENTER);

		JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
		separator.setPreferredSize(new Dimension(this.getWidth(),20));
		this.add(separator, BorderLayout.NORTH);
		
		this.iniSouthPanel();
		
	}

	private void iniSouthPanel() {
		this.editButton = new EditItemButton("Edit", this);
		this.saveButton = new SaveItemButton("Save", this);

		this.southPanel = new JPanel();
		this.southPanel.setLayout(new GridLayout(1, 5));
		
		
		this.lastUpdateLabel = new JLabel("Last update on:" + DateFormat.getDateInstance(DateFormat.SHORT).format(this.todoItem.getLastUpdate()));
		this.deadlineLabel = new JLabel("Dealine: " + DateFormat.getDateInstance(DateFormat.SHORT).format(this.todoItem.getLastUpdate()));
		this.versionLabel = new JLabel("Version: " + this.todoItem.getVersion());


		this.southPanel.add(editButton);
		this.southPanel.add(saveButton);
		
		this.southPanel.add(lastUpdateLabel);
		this.southPanel.add(deadlineLabel);
		this.southPanel.add(versionLabel);

		this.add(this.southPanel, BorderLayout.SOUTH);
	}

	public JTextArea getObjectTextArea() {
		return objectTextArea;
	}

	public void setObjectTextArea(JTextArea objectTextArea) {
		this.objectTextArea = objectTextArea;
	}
	
	
}
