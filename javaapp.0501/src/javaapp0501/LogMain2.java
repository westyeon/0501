package javaapp0501;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class LogMain2 {

	public static void main(String[] args) {
		//2. log.txt 파일에서 서버에 접속해서 사용한 traffic (줄에서 열번째 데이터)의 합계를 출력
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\30418\\Downloads\\log.txt")))){
			//먼저 이렇게 출력해보고 괜찮으면 별 이상 없음
			//System.out.println(br);
			
			//합계만들려면 반복문 나와서 
			
			int total = 0;
			
			//한줄씩 읽을 때는 무한 반복문을 만들기
			//여기까지는 읽어내는거 모두다
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//System.out.println(line);
				String [] data = line.split(" ");
				//System.out.println(data[9]);
				
				
				//정수로 변환이 안되는 데이터가 있는 경우
				//계속 작업을 수행하기 위해서 예외처리
				try {
				total = total + Integer.parseInt(data[9]);
				}catch(Exception e) {
					
				}
			}
			
			System.out.println("트래픽 합계:" + total);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
