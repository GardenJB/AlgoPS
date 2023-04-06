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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//test case
		int t=10;
		for(int i=0; i<t; i++) {
			int tn = Integer.parseInt(br.readLine());
			
			//찾을 문자열
			String p2 = br.readLine();
			char[] arr2 = new char[p2.length()];
			for(int j=0; j<p2.length(); j++) {
				arr2[j]=p2.charAt(j);
			}
			
			//검색할 문자열
			String p1 = br.readLine();
			char[]arr1 = new char[p1.length()];
			for(int j=0; j<p1.length(); j++) {
				arr1[j]=p1.charAt(j);
			}
			
			int a=0;
			int b=0;
			int cnt=0;
			while(a<arr1.length-arr2.length+1) {
				if(arr1[a]==arr2[b]) {
					boolean src = true;
					for(int k=0; k<arr2.length; k++) {
						if(arr1[a+k]!=arr2[k]) {
							src=false;
							break;
						}
					}
					if(src) cnt++;
				}
				a++;
			}
			System.out.printf("#%d %d\n", tn, cnt);
		}
	}

}
