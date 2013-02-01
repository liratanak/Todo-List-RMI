package item;

import java.util.Date;

public class TodoItem {

	private int id;
	private int version;
	private int priority;
	private Date lastUpdate;
	private Date deadline;
	private String title;
	private String object;

	public TodoItem() {
		this.priority = 1;
		this.lastUpdate = new Date();
	}

	public TodoItem(int id, int version, int priority, String title, String object) {
		this();
		this.id = id;
		this.version = version;
		this.priority = priority;
		this.title = title;
		this.object = object;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public static void main(String[] args) {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
