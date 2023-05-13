import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			StringBuilder sb = new StringBuilder();
			//층수 h
			int h = sc.nextInt();
			//각 층 방 수 w
			int w = sc.nextInt();
			//몇 번째 손님 n
			int n = sc.nextInt();
			
			//배정 방 층
			int f = n%(h)==0? h : n%h;
			sb.append(f);
			//배정 방 번호** h의 배수인 경우 마찬가지로 고려해봐야
			int r = n%h==0? n/h: n/h+1;
			if(r>=10) sb.append(r);
			else sb.append("0"+r);
			
			System.out.println(sb);
			
		}
	}

}
