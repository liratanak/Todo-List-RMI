package action;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Client extends UnicastRemoteObject implements IClient, ClientAtions {

	private static final long serialVersionUID = -5670215055232462546L;

	public Client() throws RemoteException {
		super();
	}

	@Override
	public void notifyClient() {
		
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

}
