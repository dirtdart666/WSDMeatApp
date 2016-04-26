package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;

public class Poll implements Serializable {

	private String title;
	private String createUsername;
	private String creationDate;
	private boolean open;
	private ArrayList<String> times;

	public Poll(String title, String createUsername, String creationDate, boolean open, ArrayList<String> times) {
		super();
		this.title = title;
		this.createUsername = createUsername;
		this.creationDate = creationDate;
		this.open = open;
		this.times = times;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreateUsername() {
		return createUsername;
	}

	public void setCreateUsername(String createUsername) {
		this.createUsername = createUsername;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public ArrayList<String> getTimes() {
		return times;
	}

	public void setTimes(ArrayList<String> times) {
		this.times = times;
	}

}
