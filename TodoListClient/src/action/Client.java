package action;

import gui.frame.TodoListMainFrame;

import java.awt.Color;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import pkinterface.IClient;

public class Client extends UnicastRemoteObject implements IClient, ClientAtions, Serializable {

	private static final long serialVersionUID = -5670215055232462546L;

	public Client() throws RemoteException {
		super();
	}

	@Override
	public boolean updateAllItem() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateItem(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void notifyClient() throws RemoteException {
		TodoListMainFrame.refreshButton.setForeground(Color.BLUE);
	}

}
