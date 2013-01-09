package action;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Client extends UnicastRemoteObject implements IClient {

	private static final long serialVersionUID = -5670215055232462546L;

	protected Client() throws RemoteException {
		super();
	}

	@Override
	public void notifyClient() {
		
	}

}
