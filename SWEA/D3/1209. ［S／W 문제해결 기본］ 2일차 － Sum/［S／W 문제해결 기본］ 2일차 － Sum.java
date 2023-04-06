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
	public static void main(String args[]) throws Exception
	{
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		//System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		//test case
		int t =10;
		for(int a=0; a<t; a++) {
			//test case no
			int n = sc.nextInt();
			
			//배열
			int[][] arr = new int[100][100];
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			//행의 합
			int[] sumarr = new int[100];
			for(int i=0; i<100; i++) {
				int sum =0;
				for(int j=0; j<100; j++) {
					sum += arr[i][j];
				}
				sumarr[i] = sum;
			}
			//행의 최대값
			int max1=0;
			for(int i=0; i<100; i++) {
				if(max1<sumarr[i])
					max1=sumarr[i];
			}
			
			//열의 합
			for(int j=0; j<100; j++) {
				int sum1 =0;
				for(int i=0; i<100; i++) {
					sum1 += arr[i][j];
					
				}
				sumarr[j] = sum1;
			}
			//열의 최대값
			int max2=0;
			for(int i=0; i<100; i++) {
				if(max2<sumarr[i])
					max2=sumarr[i];
			}
			
			//대각선 1
			int max3=0;
			for(int i=0; i<100; i++) {
				max3 += arr[i][i];
			}
			
			//대각선2
			int max4=0;
			for(int i=0; i<100; i++) {
				max4 += arr[i][99-i];
			}
			
			//최대값
			int max = max1;
			if(max2>max)
				max=max2;
			if(max3>max)
				max=max3;
			if(max4>max)
				max=max4;
			
			System.out.printf("#%d %d\n", n, max);
		}
		sc.close();
	}
}