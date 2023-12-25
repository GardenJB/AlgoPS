import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[][] checkPoint;
	static int distance ;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		N = Integer.parseInt(br.readLine());
		checkPoint = new int[N][2];
		for(int i = 0 ; i < N ; i++) {			
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			checkPoint[i][0] = x;
			checkPoint[i][1] = y;
			if(i >= 1) {
				distance += Math.abs(checkPoint[i][0] - checkPoint[i-1][0]) +Math.abs(checkPoint[i][1] - checkPoint[i-1][1]); 
			}
		}
		
		for(int i = 1; i < N-1 ; i++) {
			int original = Math.abs(checkPoint[i][0]-checkPoint[i-1][0]) 
							+ Math.abs(checkPoint[i][1]-checkPoint[i-1][1])
							+ Math.abs(checkPoint[i][0]-checkPoint[i+1][0]) 
							+ Math.abs(checkPoint[i][1]-checkPoint[i+1][1]);
			int jump = Math.abs(checkPoint[i-1][0] - checkPoint[i+1][0])
						+ Math.abs(checkPoint[i-1][1] - checkPoint[i+1][1]);
			
			min = Math.min(min, distance - original + jump);
		}		
		System.out.println(min);
	}
}