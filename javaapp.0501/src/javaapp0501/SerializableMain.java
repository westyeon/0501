package javaapp0501;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableMain {

	public static void main(String[] args) {
		//파일에 인스턴스 단위로 기록
		
		try(ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("./oo.dat"))){
			//DTO클래스의 인스턴스를 생성
			DTO dto = new DTO("a05" ,"극한직업", 4.9);
			//파일에 기록
			dos.writeObject(dto);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./oo.dat"))){
			
			DTO dto = (DTO)ois.readObject();
			System.out.println(dto);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}

