import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//방의 정원
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		//전체 학생 수 n
		int n = Integer.parseInt(st.nextToken());
		
		boolean ch = false;
		
		outer:
		for(int i=0; i<=300; i++) {
			for(int j=0; j<=300; j++) {
				for(int k=0; k<=300; k++) {
					if(a*i + b*j + c*k == n) {
						System.out.println(1);
						ch = !ch;
						break outer;
					}
				}
			}
		}
		if(!ch) System.out.println(0);
	}

}
