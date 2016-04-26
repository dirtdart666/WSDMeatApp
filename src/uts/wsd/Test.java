package uts.wsd;

import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Test {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		Polls polls = new Polls();
		polls.addPoll(new Poll("Test Poll One", "Mike K", "1 Jan 1990", true, list));
		polls.addPoll(new Poll("Test Poll One", "Mike K", "1 Jan 1990", true, list));
		JAXBContext jc = JAXBContext.newInstance(Polls.class);
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(polls, System.out);
	}

}
