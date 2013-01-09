package action;

import java.rmi.Remote;

public interface IClient extends Remote {
	public void notifyClient();
}
