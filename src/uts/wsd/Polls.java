package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;

public class Polls implements Serializable {

	private ArrayList<Poll> list = new ArrayList<>();

	public ArrayList<Poll> getList() {
		return list;
	}

	public void addPoll (Poll poll)
	{
		list.add(poll);	
	}	
	
	
}
