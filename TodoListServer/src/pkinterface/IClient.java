package pkinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IClient extends Remote {
	public void notifyClient() throws RemoteException;
}
