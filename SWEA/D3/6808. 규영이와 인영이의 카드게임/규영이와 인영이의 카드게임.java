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
	
	static int[] arr1, arr2;
	static int cnt_w, cnt_l, sum1, sum2;
	static boolean[] ch;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case 반복
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			//규영이 카드 조합
			arr1 = new int[9];
			for(int i=0; i<9; i++) {
				arr1[i]=sc.nextInt();
				//System.out.println(arr1[i]);
			}
			//인영s 카드 조합
			arr2 = new int[9];
			int a=0;
			outer :
			for(int i=1; i<=18; i++) {
				for(int c : arr1) {
					if(c==i) {
						continue outer;
					}
				}
				arr2[a]=i;
				//System.out.println(arr2[a]);
				a++;
			}
			//규영 승
			cnt_w=0;
			//규영 패
			cnt_l=0;
			
			//규영 점수
			sum1=0;
			//인영 점수 
			sum2=0;
			//확인 배열
			ch = new boolean[9];
			
			game(0);
			System.out.printf("#%d %d %d\n", tc, cnt_w, cnt_l);
		}
	}
	
	private static void game(int k) {
		if(k==9) {
			if( sum1>85 ) {
				cnt_w++;
				
			} else {
				cnt_l++;
			}
			return;
		}
		
		
			for(int j=0; j<9; j++) {
				if(ch[j]) continue;
				ch[j]=true;
				if(arr1[k]>arr2[j]) {
					sum1+=arr1[k]+arr2[j];
				}else {
					sum2+=arr1[k]+arr2[j];	
				}
				
				game(k+1);
				
				if(arr1[k]>arr2[j]) {
					sum1-=arr1[k]+arr2[j];
				}else {
					sum2-=arr1[k]+arr2[j];	
				}
				
				ch[j]=false;
			}
	}

}