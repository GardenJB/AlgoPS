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
	static int k;
	static int[] A;
	static int[] ch;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//test case 반복
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {

			//자연수 n개
			n = sc.nextInt();
			//목표합 k
			k = sc.nextInt();

			//수열 A
			A = new int[n];
			for (int i = 0; i < n; i++) {
				A[i] = sc.nextInt();
			}

			//경우의 수
			ch = new int[n];
			cnt = 0;

			pset(0);
			System.out.printf("#%d %d\n", tc, cnt);

		}
	}

	static void pset(int j) {
		//기저 조건
		//모두 돌았다면 결과 보기
		int sum = 0;
		if (j == n) {
			for (int i = 0; i < n; i++) {
				if (ch[i] == 1) {
					sum += A[i];
				}
			}
			//선택한 조합이 목표합과 같으면 세기
			if (sum == k) {
				cnt++;
			}
			return;

		}

		//유도 조건
		//선택하면 1, 아니면 0 반복
		for (int i = 0; i < 2; i++) {
			ch[j] = i;
			pset(j + 1);
		}
	}
}