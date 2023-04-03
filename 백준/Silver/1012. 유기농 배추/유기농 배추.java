

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//test case 반복
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			//배추밭 가로길이 m, 세로길이 n, 배추 위치 개수 k
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			//배추밭 배열
			int[][] map = new int[n][m];
			for(int i=0; i<k; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[x][y]=1;
			}
			
			//bfs
			Queue<int[]> q = new LinkedList<int[]>();
			boolean[][] ch = new boolean[n][m];
			int ans =0;
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					//배추 발견
					if(map[i][j]==1 && !ch[i][j]) {
						int[] temp = new int[2];
						temp[0]=i;
						temp[1]=j;
						q.add(temp);
						ch[i][j]=true;	
						ans++;
					}
					
					int[] dx = {0, -1, 0, 1};
					int[] dy = {-1, 0, 1, 0};
					//탐색
					while(!q.isEmpty()) {
						int[] temp = q.poll();
						for(int a=0; a<4; a++) {
							int x = temp[0]+dx[a];
							int y = temp[1]+dy[a];
							if(x<0 || y<0 || x>=n || y>=m) continue;
							if(map[x][y]==1 && !ch[x][y]) {
                                //****
								int[] arr=new int[2];
								arr[0]=x;
								arr[1]=y;
								q.add(arr);
								ch[x][y]=true;
							}
						}
					}
				}
			}
			bw.append(ans+"\n");
		}
		bw.close();
	}
}
