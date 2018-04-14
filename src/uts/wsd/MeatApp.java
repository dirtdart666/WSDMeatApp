package uts.wsd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class MeatApp implements Serializable {

	private String creatorFilePath;
	private Creators creators;

	public MeatApp() {
		// TODO Auto-generated constructor stub
	}

	public String getCreatorFilePath() {
		return creatorFilePath;
	}

	public void setCreatorFilePath(String creatorFilePath) throws JAXBException, IOException {
		this.creatorFilePath = creatorFilePath;

		JAXBContext jc = JAXBContext.newInstance(Creators.class);
		Unmarshaller u = jc.createUnmarshaller();

		FileInputStream fin = new FileInputStream(creatorFilePath);
		creators = (Creators) u.unmarshal(fin);
		fin.close();
	}

	public Creators getCreators() {
		return creators;
	}

	public void setCreators(Creators creators) {
		this.creators = creators;
	}

}
