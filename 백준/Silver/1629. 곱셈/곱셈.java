

import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		//대상 수 a
		int a = Integer.parseInt(st.nextToken());
		//곱의 수 b
		int b = Integer.parseInt(st.nextToken());
		//나눌 c
		int c = Integer.parseInt(st.nextToken());
		
		System.out.println(mul(a, b, c));
	}
	
	private static long mul(int a, int b, int c) {
		if(b==1)
			return a %c;
		if(b%2 !=0) {
			long k = mul(a, b-1, c);
			return k * a %c;
		}
			
		else {
			long k = mul(a, b/2, c);
			return k * k %c;
		}
			
	}

}
