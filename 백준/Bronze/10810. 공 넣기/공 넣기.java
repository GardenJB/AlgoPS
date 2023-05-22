import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		//바구니 수 n
		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		//공 넣기 반복 횟수 m
		int m = Integer.parseInt(st.nextToken());
		
		for(int mn=0; mn<m; mn++) {
			
			st = new StringTokenizer(sc.nextLine());
			
			//시작 바구니 번호 i
			int i = Integer.parseInt(st.nextToken());
			
			//끝 바구니 번호 j
			int j = Integer.parseInt(st.nextToken());
			
			//넣을 공 번호 k
			int k = Integer.parseInt(st.nextToken());
			
			//바구니에 공 넣기
			for(int nn=i; nn<=j; nn++) {
				arr[nn]=k;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		//최종 결과
		for(int i=1; i<=n; i++) {
			sb.append(arr[i]+" ");
		}
		
		System.out.println(sb);
		
	}

}
