/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	static int n, b, min_h, sum;
	static int[] hei;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//test case 반복
		int t=sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			//직원 수 n
			n = sc.nextInt();
			//선반 높이 b
			b = sc.nextInt();
			
			//직원 키 배열
			hei = new int[n];
			for(int i=0; i<n; i++) {
				hei[i]=sc.nextInt();
			}
			
			min_h=Integer.MAX_VALUE;
			sum=0;
			choi(0);
			sb.append("#"+tc+" "+min_h+"\n");
		}
		System.out.println(sb);
	}
	
	private static void choi(int k) {
		if(sum>=b) {
			int mm = sum-b;
			if(min_h>mm) min_h=mm;
			return;			
		}else if(k==n) {
			return;
		}
        
		sum+=hei[k];
		choi(k+1);
		sum-=hei[k];
		choi(k+1);
	}

}
