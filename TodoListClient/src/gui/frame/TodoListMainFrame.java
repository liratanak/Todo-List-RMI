package gui.frame;

import gui.panel.TodoItemPanel;
import gui.panel.TodoListMainPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import main.MainTodoListClient;

import pkinterface.TodoItemInterface;

public class TodoListMainFrame extends JFrame {

	private static final long serialVersionUID = 8789537747564876190L;
	private Dimension frameSize = new Dimension(720, 640);
	private JPanel mainPanel;
	public static JButton refreshButton;

	public TodoListMainFrame(String title, Map<Integer, TodoItemInterface> listTodoItems) {
		super(title);

		this.setLayout(new BorderLayout());

		List<TodoItemPanel> listTodoItemPanel = new ArrayList<TodoItemPanel>();

		for (TodoItemInterface todoListItem : listTodoItems.values()) {
			listTodoItemPanel.add(new TodoItemPanel(todoListItem));
		}

		this.mainPanel = new TodoListMainPanel(listTodoItemPanel);

		this.add(mainPanel, BorderLayout.CENTER);

		TodoListMainFrame.refreshButton = new JButton("Refresh");
		this.add(TodoListMainFrame.refreshButton, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(frameSize);
		this.setLocation(getMidPoint());
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					MainTodoListClient.serverObject.disconnect(MainTodoListClient.client);
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
			};
		});
	}

	private Point getMidPoint() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
		return new Point((screenSize.width - frameSize.width) / 3, (screenSize.height - frameSize.height) / 3);
	}

}
