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
	
	static int n, min_d;
	static int[][] map;
	static int[] ch;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case 반복
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			//고객 수 n
			 n = sc.nextInt();
			 //좌표
			 map = new int[n+2][2];
			 for(int i=0; i<n+2; i++) {
				 map[i][0] = sc.nextInt();
				 map[i][1] = sc.nextInt();
			 }
			 //순서배열
			 ch = new int[n+2];
			 min_d = Integer.MAX_VALUE;
			 per(0, 0, 0);
			 System.out.printf("#%d %d\n", tc, min_d);
			 
		}
	}
	
	private static void per(int k, int sum, int a) {
		if(sum>=min_d) {
			return;
		}
		if(k==n) {
			
			if(sum<min_d) min_d=sum;
			return;
		}
		
		for(int i=2; i<=n+1; i++) {
			int temp=0;
			if(ch[i]==0) {
				ch[i]=k+1;
				 if(k==0)
					temp=Math.abs(map[0][0]-map[i][0])+Math.abs(map[0][1]-map[i][1]);
				 else {
					
					temp = Math.abs(map[i][0]-map[a][0])+Math.abs(map[i][1]-map[a][1]);
					if(k==n-1)
						temp+=Math.abs(map[1][0]-map[i][0])+Math.abs(map[1][1]-map[i][1]);
				 }
				per(k+1, sum+temp, i);
				ch[i]=0;
			}
		}
	}
}