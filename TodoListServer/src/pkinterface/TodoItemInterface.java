package pkinterface;

import java.io.Serializable;
import java.util.Date;

public interface TodoItemInterface extends Serializable {
	public int getId();
	public void setId(int id);
	
	public int getVersion();
	public void setVersion(int version);
	
	public int getPriority();
	public void setPriority(int priority);
	
	public Date getLastUpdate();
	public void setLastUpdate(Date lastUpdate);
	
	public Date getDeadline();
	public void setDeadline(Date deadline);
	
	public String getObject();
	public void setObject(String object) ;
	
	public String getTitle();
	public void setTitle(String title);
}
