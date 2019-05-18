package day01.ex05.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
//	@Autowired
//	@Qualifier("docu")
	private Document doc;
	
	//생성자
//	@Autowired
//	@Qualifier("docu")
	public Printer(Document doc) {
		this.doc=doc;
		
	}
	public Printer() {
		
	}
    //getter
	public Document getDoc() {
		return doc;
	}
    //setter
	@Autowired
	@Qualifier("docu")
	public void setDoc(Document doc) {
		this.doc = doc;
	}

}
