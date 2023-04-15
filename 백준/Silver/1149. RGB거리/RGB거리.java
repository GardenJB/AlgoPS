import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//집 수 n 반복
		int n = Integer.parseInt(st.nextToken());
		int[][] cost = new int[n][3];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			cost[i][0]= Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());
		}
		
		
		//***선택 해당 집까지의 최소 비용은 선택 색 비용 + 이전 선택 최소 비용 겹치지 않는 경우
		for(int i=1; i<n; i++) {
			cost[i][0] +=Math.min(cost[i-1][1], cost[i-1][2]);
			cost[i][1] +=Math.min(cost[i-1][0], cost[i-1][2]);
			cost[i][2] +=Math.min(cost[i-1][0], cost[i-1][1]);
		}
		
		System.out.println(Math.min(Math.min(cost[n-1][0], cost[n-1][1]), cost[n-1][2]));
		
	}
	

}
