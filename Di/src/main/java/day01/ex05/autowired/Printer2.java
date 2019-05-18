package day01.ex05.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;

public class Printer2 {
	/*
	 * @Resource-->이름으로 빈을 찾음->타입으로 찾음
	 * -변수,메서드에만 적용가능함(생성자에 사용x)
	 */
	@Resource(name="docu2")
	private Document doc;
	
	//생성자
	public Printer2(Document doc) {
		this.doc=doc;
		
	}

    //getter
	public Document getDoc() {
		return doc;
	}
    //setter
	public void setDoc(Document doc) {
		this.doc = doc;
	}

}
