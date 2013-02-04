package main;

import gui.frame.TodoListMainFrame;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Map;

import javax.swing.SwingUtilities;

import action.Client;

import pkinterface.IClient;
import pkinterface.TodoItemInterface;
import pkinterface.TodoListServerInterface;

public class MainTodoListClient {
	
	public static Map<Integer, TodoItemInterface> listTodoItems;
	public static TodoListServerInterface serverObject;
	public static IClient client;
	public static TodoListMainFrame todoListMainFrame;

	public static void main(String[] args) {
		try {
			MainTodoListClient.client = new Client();
//			System.setSecurityManager(new SecurityManager());

			String name = "TodoListServer";
			Registry registry = LocateRegistry.getRegistry("localhost");
			MainTodoListClient.serverObject = (TodoListServerInterface) registry.lookup(name);

			MainTodoListClient.listTodoItems = MainTodoListClient.serverObject.getList(MainTodoListClient.client);
			iniClientGui();
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

	private static void iniClientGui() {
		try {
			//set look and fell 
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.MainTodoListClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.MainTodoListClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.MainTodoListClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.MainTodoListClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		
		SwingUtilities.invokeLater(new Runnable() {	
			@Override
			public void run() {
				MainTodoListClient.todoListMainFrame = new TodoListMainFrame("Todo List", MainTodoListClient.listTodoItems) ;
			}
		}) ;
	}
}
