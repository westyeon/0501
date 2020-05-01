package javaapp0501;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class ByteBufferInOut {

	public static void main(String[] args) {
		//바이트 단위로 버퍼를 이용해서 기록
		try(PrintStream ps = new PrintStream("./buf.txt")){
			ps.write("버퍼를 이용한 기록".getBytes());  //ps.print 하면 [B@15db9742 이렇게 나오고 ps.write하면 버퍼를 이용한 기록 이렇게 나옴
			ps.flush();
		}catch(Exception e) {
			//예외내용을 출력
			
			System.out.println(e.getMessage());
			//예외 발생 지점을 역추적
			e.printStackTrace();
		}
		
		//버퍼 단위로 읽어오기
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./buf.txt"))){
			byte [] b = new byte[512];
			bis.read(b);
			
			System.out.println(new String(b));
		}catch(Exception e) {
			//예외내용을 출력
			
			System.out.println(e.getMessage());
			//예외 발생 지점을 역추적
			e.printStackTrace();
			
		}
		
	}

}
