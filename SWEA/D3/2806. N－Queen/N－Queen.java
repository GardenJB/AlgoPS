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
	static int n, cnt;
	static boolean[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case 반복
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			//배열 크기, 퀸 수 n
			n = sc.nextInt();
			map = new boolean[n][n]; 
			
			//총 경우의수
			cnt=0;
			cho(0);
			System.out.printf("#%d %d\n", tc, cnt);
			
			
		}
	}
	
	//자리 확인
	private static boolean ch(int x, int y) {
		//세로
		for(int i=0; i<n; i++) {
			if(map[i][y]) {
				return false;
			}
		}
		
		int a=0;
		//대각선1
		while(true) {
			if(x-a>=0 &&  y-a>=0) {
				if(map[x-a][y-a])
					return false;
			}
			if(x+a<n && y+a<n) {
				if(map[x+a][y+a]) {
					return false;
				}
			}
			a++;
			if(x-a<0 && y-a<0 && x+a>n && y+a>n)
				break;
		}
		
		a=0;
		//대각선2
		while(true) {
			if(x-a>=0 &&  y+a<n) {
				if(map[x-a][y+a])
					return false;
			}
			if(x+a<n && y-a>=0) {
				if(map[x+a][y-a]) {
					return false;
				}
			}
			a++;
			if(x-a<0 && y-a<0 && x+a>n && y+a>n)
				break;
		}
		
		return true;
	}
	
	
	//q 선택
	private static void cho(int k) {
		if(k==n) {
			cnt++;
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(ch(k, i)) {
				map[k][i]=true;
				cho(k+1);
				map[k][i]=false;
			}
		}
	}

}
