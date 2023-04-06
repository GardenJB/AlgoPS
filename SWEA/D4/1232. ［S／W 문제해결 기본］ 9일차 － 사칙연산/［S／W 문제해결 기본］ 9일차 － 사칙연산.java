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
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static String[] tr;
	static String x;
	static Stack<Integer> num;
    
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
	//test case 반복 
		int t =10;
		for(int tc=1; tc<=t; tc++) {
			
			//정점 수 n 
			int n = Integer.parseInt(sc.nextLine());

			//트리배열 
			tr = new String[10000];
			//숫자 구분*****
			boolean[] trr = new boolean[tr.length];
			
			for(int nt=1; nt<=n; nt++) {
				String c= null;
				String d= null;
				//문자열 받기
				StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				String b = st.nextToken();

				if(st.hasMoreTokens())
					c = st.nextToken();
				if(st.hasMoreTokens())
					d = st.nextToken();
				
				//트리 배열 채우기
				//부모 노드
				//1인 경우
				if(a==1) {
					tr[a]=b;
					trr[a]=true;
					
					//1이 아닌 경우 인덱스 찾기
				} else {
					for(int i=1; i<=tr.length; i++) {
						if(trr[i]!=true && tr[i] != null &&  !tr[i].equals("+") &&  !tr[i].equals("-") && !tr[i].equals("*") && !tr[i].equals("/") && Integer.parseInt(tr[i])==a) {
							a=i;
							tr[a]=b;
							trr[a]=true;
							break;
						}		
					}
				}
	
				//자식 노드
				if(c != null) {
					tr[a*2]=c;
					tr[a*2+1]=d;
				}
			}
//			for(int z=0; z<tr.length; z++) {
//				System.out.println(tr[z]);
//			}

			//연산 하기
			num = new Stack<>();
			//트리 배열 후위 순회
			tra(1);

			System.out.printf("#%d %d\n", tc, num.pop());
		}
	}
	
	public static void tra(int k) {
		if(k<tr.length) {
			//l
			tra(k*2);
			//r
			tra(k*2+1);
			//v
			if(tr[k] != null) {
				x=tr[k];
				if(!x.equals("+") && !x.equals("-") && !x.equals("*") && !x.equals("/")) {
					num.push(Integer.parseInt(x));
				}else {
					int x1;
					int x2;
					int x3;
					switch(x) {
					
					case "+" :
						x2 = num.pop();
						x1 = num.pop();
						x3 = x1 + x2;
						num.push(x3);
						break;
						
					case "-" :
						x2 = num.pop();
						x1 = num.pop();
						x3 = x1 - x2;
						num.push(x3);
						break;
						
					case "*" :
						x2 = num.pop();
						x1 = num.pop();
						x3 = x1 * x2;
						num.push(x3);
						break;
						
					case "/" :
						x2 = num.pop();
						x1 = num.pop();
						x3 = x1 / x2;
						num.push(x3);
						break;
					}
				}
			}		
		}		
	}

}