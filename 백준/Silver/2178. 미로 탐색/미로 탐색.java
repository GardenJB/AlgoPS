

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//배열 길이 n, m
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		//미로 배열
		int[][] map = new int[n][m];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {

				map[i][j]=(int) (s.charAt(j)-'0');
			}
		}
		
		//bfs
		Queue<int[]> q = new LinkedList<int[]>();
		boolean[][] ch = new boolean[n][m];
		//출발
		int[] temp = new int[2];
		temp[0]=0;
		temp[1]=0;
		ch[0][0]=true;
		q.add(temp);
		
		int[] dx = {0, -1, 0, 1};
		int[] dy = {-1, 0, 1, 0};
		outer :
		while(!q.isEmpty()) {
			temp = q.poll();
			for(int a =0; a<4; a++) {
				int x = temp[0]+dx[a];
				int y = temp[1]+dy[a];
				if(x<0 || y<0 || x>=n || y>=m) continue;
				if(map[x][y]==1 && !ch[x][y] ) {
					//이전 칸보다 +1
					map[x][y]=map[temp[0]][temp[1]]+1;
					
					if(x==n-1 && y ==m-1) {
						System.out.println(map[x][y]);
						break outer;
					}
					int[] arr = new int[2];
					arr[0]=x;
					arr[1]=y;
					q.add(arr);
				}
			}
		}
		
		
	}

}
