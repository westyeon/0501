package javaapp0501;

import java.io.Serializable;

//영화정보를 저장할 클래스 - VO, DTO, Domain 클래스라고도 합니다.
public class MovieDTO implements Serializable{
	//데이터를 구성할 프로퍼티 private으로 선언
	//번호(정수) , 영화제목(문자열), 영화감독(문자열), 주연배우(문자열)
	private int num;
	private String title;
	private String direction;
	private String actor;
	
	//이번 작업은 대부분 데이터 베이스를 사용하기 전에만 수행
		//인스턴스를 빠르게 만들기 위한 생성자 추가
		public MovieDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
		
		
	
		public MovieDTO(int num, String title, String direction, String actor) {
		super();
		this.num = num;
		this.title = title;
		this.direction = direction;
		this.actor = actor;
	}






		//접근자 메소드 - getter & setter
		//프로퍼티를 private으로 만들었기 때문에
		//인스턴스가 직접 접근이 안되서 프로퍼티에 접근하기 위해서 만든
		//메소드

	
	



	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}



	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}



	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}



	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}



	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}



	/**
	 * @return the actor
	 */
	public String getActor() {
		return actor;
	}



	/**
	 * @param actor the actor to set
	 */
	public void setActor(String actor) {
		this.actor = actor;
	}
	
		
		
		
		
		
		
		
		
		
		
		
//디버깅을 위한 메소드
	//이 메소드를 만들지 않으면 인스턴스 이름을 가지고 인스턴스를
	//출력할때 클래스 이름과 해시코드가 리턴
	//프로퍼티의 값을 빠르게 확인하기 위해서 만드는 메소드
	

		
		@Override
	public String toString() {
		return "MovieDTO [num=" + num + ", titile=" + title + ", direction=" + direction + ", actor=" + actor + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
