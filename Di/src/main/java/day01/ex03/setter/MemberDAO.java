package day01.ex03.setter;

public class MemberDAO {
	
	private DatabaseDev ds;

	
	//setter
	public void setDs(DatabaseDev ds) {
		this.ds = ds;
	}
	
	public void info() {
		System.out.println("ds의 주소:"+ds.getUrl());
		System.out.println("ds의 아이디:"+ds.getUid());
		System.out.println("ds의 비밀번호:"+ds.getUpw());
	}
	
	
	

}
