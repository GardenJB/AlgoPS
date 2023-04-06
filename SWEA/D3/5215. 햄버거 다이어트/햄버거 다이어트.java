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
	static int n;
	static int l;
	static int[] score;
	static int[] cal;
	static int[] ch;
	static int sum_s;
	static int sum_l;
	static int max_s;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case 반복
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			//재료의 수 n
			n = sc.nextInt();
			//칼로리 상한치 l
			l = sc.nextInt();
			
			//재료 점수 배열
			score =  new int[n];
			//재료 칼로리 배열
			cal = new int[n];
			
			for(int i=0; i<n; i++) {
				score[i]=sc.nextInt();
				cal[i]=sc.nextInt();
			}
			//선택 배열
			ch = new int[n];
			max_s=0;
			choice(0);
			System.out.printf("#%d %d\n", tc, max_s);
			
		}
	}
	private static void choice(int k) {
		//기저
		if(k==n) {
			sum_s =0;
			sum_l=0;
			//System.out.println(Arrays.toString(ch));
			for(int i=0; i<n; i++) {
				
				if(ch[i]==1) {
					sum_s+=score[i];
					sum_l+=cal[i];
				}
			}
			if(sum_l<=l && max_s<sum_s)
				max_s=sum_s;
			return;
		}
		//유도
		for(int i=0; i<2; i++) {
			ch[k]=i;
			choice(k+1);
		}
	}

}
