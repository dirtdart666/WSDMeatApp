package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Creators implements Serializable {

	@XmlElement(name = "creator")
	private ArrayList<Creator> list = new ArrayList<>();

	public ArrayList<Creator> getList() {
		return list;
	}

	public void addCreator(Creator creator) {
		list.add(creator);
	}
	
	public void setList(ArrayList<Creator> list) {
		this.list = list;
	}

	public Creator login(String username, String password) {
		for (Creator creator : list) {
			if (creator.getUsername().equals(username) && creator.getPassword().equals(password)) {
				return creator;
			}
		}
		return null;
	}

}
