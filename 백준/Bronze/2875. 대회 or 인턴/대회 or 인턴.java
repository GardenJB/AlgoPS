import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//여학생 수 n
		int n = Integer.parseInt(st.nextToken());
		//남학생 수 m
		int m = Integer.parseInt(st.nextToken());
		//인턴쉽 인원 k
		int k = Integer.parseInt(st.nextToken());
		
		//팀 만족 인원 여학생, 남학생
		int girl = 2;
		int boy = 1;
		
		//결성 팀 수 
		int team = 0;
		
		//조건 확인
		while(n>= girl && m >= boy && n+m >= k+girl+boy) {
			n -= girl;
			m -= boy;
			team++;
		}
		
		
		System.out.println(team);
	}

}
