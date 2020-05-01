package javaapp0501;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class LogMain {

	public static void main(String[] args) {
		// 현재 디렉토리에 있는 0422.txt 파일의 내용읽기!!!!! 읽을때는 이거!! 알아두기
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\30418\\Downloads\\log.txt")))){
			//IP를 중복없이 저장하기 위한 Set을 생성
			HashSet<String> set = new HashSet<>();
			//TreeSet으로도 한번 해보기 뭔지 확인해보고 어떤건지 알고 해보기 
			
			//파일의 전체 내용을 줄 단위로 읽기
			while(true) {
				//한줄을 읽어서 line에 저장
				String line = br.readLine();
				//읽은 내용이 없으면 중단
				if(line ==null) {
					break;
				}
				//읽은 데이터가 있으면 출력
				//System.out.println(line);
				
				//공백을 기준으로 문자열 분할
				String [] data = line.split(" ");
				//분할된 데이터 중에서 첫번째 데이터만 출력
				//System.out.println(data[0]);
				set.add(data[0]);
			}
			for(String ip : set) {
				System.out.println(ip);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
