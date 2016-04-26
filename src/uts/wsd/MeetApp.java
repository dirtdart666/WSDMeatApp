package uts.wsd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class MeetApp implements Serializable {
	
	private String filePath;
	private Creators creators;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) throws JAXBException, IOException {
		this.filePath = filePath;

		JAXBContext jc = JAXBContext.newInstance(Creators.class);
		Unmarshaller u = jc.createUnmarshaller();

		FileInputStream fin = new FileInputStream(filePath);
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
