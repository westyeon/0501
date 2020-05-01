import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		//파일에 대한 정보를 리턴해주는 File 인스턴스 생성
		File file = new File("D:\\안드&앱\\0501-1.txt");
		//파일의 마지막 수정날짜 확인
		long lastModified = file.lastModified();
		//epoch time을 Date로 변환
		Date date = new Date(lastModified);
		System.out.println(date);
		
		//파일의 크기 확인
		long length = file.length();
		System.out.println(length/1024 + "KB"); //KB로 하려면 /1024하면됨 그리고 웬만하면 KB로 바꿔서 보기

	}

	
	
}
