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
import java.util.LinkedList;
import java.util.Queue;
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
	//test case 반복
		int t = sc.nextInt();
		for(int tc =1; tc<=t; tc++) {
			//치즈 한변의 길이 n
			int n = sc.nextInt();
			
			//치즈 맛 배열
			int[][] chee = new int[n][n];
			//요정이 먹을 수 있는 최대 일 수
			int max_d = 0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					chee[i][j] = sc.nextInt();
					
					if(max_d<chee[i][j]) max_d = chee[i][j];
				}
			}
			
			//최대 치즈 덩어리 수
			int ans=0;
			
			//요정이 먹는 날까지
			for(int i=0; i<=max_d; i++) {
				//덩어리 수 
				int cnt=0;
				//확인 배열
				boolean[][] ch = new boolean[n][n];
				
				Queue<int[]> q = new LinkedList<int[]>();
				//덩어리 수 세기
				for(int r =0; r<n; r++) {
					for(int c=0; c<n; c++) {
						//요정이 안 먹었고, 확인 x
						if(chee[r][c]>i && !ch[r][c]) {
							ch[r][c]=true;
							int[] temp = new int[2];
							temp[0]=r;
							temp[1]=c;
							cnt++;
							q.add(temp);
							
							//델타
							int[] dx = {0, -1, 0, 1};
						 	int[] dy = {-1, 0, 1, 0};
							//한 덩어리 구하기
							while(!q.isEmpty()) {
								temp =q.poll();
								for(int d=0; d<4; d++) {
									int x =temp[0]+dx[d];
									int y = temp[1]+dy[d];
									if(x<0 || y<0 || x>=n || y>=n ||chee[x][y]<=i || ch[x][y] ) continue;
									int[] arr = new int[2];
									arr[0]=x;
									arr[1]=y;
									ch[x][y]=true;
									q.add(arr);
									
								}
							}
						}
					}
				}
				if(ans<cnt) ans=cnt;
			}
			System.out.printf("#%d %d\n", tc, ans);
		}
		sc.close();
	}
}