package javaapp0501;

import java.io.Serializable;

//영화코드(문자열), 영화제목(문자열), 영화평점 (실수)를 저장하는 
public class DTO implements Serializable{
	
	private String code;
	private String title;
	private double grade;
	
	public DTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DTO(String code, String title, double grade) {
		super();
		this.code = code;
		this.title = title;
		this.grade = grade;
	}
	
	
	
	

	
}
