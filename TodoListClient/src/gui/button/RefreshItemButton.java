package gui.button;

import gui.frame.TodoListMainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;

import main.MainTodoListClient;

public class RefreshItemButton extends JButton implements ActionListener {

	private static final long serialVersionUID = 1L;

	public RefreshItemButton(String title){
		super(title);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
//			MainTodoListClient.todoListMainFrame.dispose();
//			MainTodoListClient.todoListMainFrame = null;
//			MainTodoListClient.todoListMainFrame = new TodoListMainFrame("Todo List", MainTodoListClient.serverObject.getList(MainTodoListClient.client)) ;
			MainTodoListClient.todoListMainFrame.initializeMainPanel(MainTodoListClient.serverObject.getList(MainTodoListClient.client));
			MainTodoListClient.todoListMainFrame.validate();
		} catch (RemoteException e1) {
			e1.printStackTrace();
		}
	}

}
