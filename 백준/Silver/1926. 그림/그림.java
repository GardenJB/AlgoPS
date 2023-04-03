

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//도화지 세로 n, 가로 m
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//그림 배열
		int[][] map = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		//그림 수 
		int cnt =0;
		//최대 그림 크기
		int max_s =0;
		
		Queue<int[]> q = new LinkedList<int[]>();

		//bfs
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				//그림 발견
				if(map[i][j]==1) {
					//그림 수 ++
					cnt++;
					//그림 크기 세기 위한 임시 변수
					int temp =1;
					//체크
					map[i][j]=0;
					int[] arr = {i, j};
					q.add(arr);
					
					//델타
					int[] dx = {0, -1, 0, 1};
					int[] dy = {-1, 0, 1, 0};
					
					//탐색
					while(!q.isEmpty()) {
						arr = q.poll();
						for(int a=0; a<4; a++) {
							int x = arr[0]+dx[a];
							int y = arr[1]+dy[a];
							//범위 확인
							if(x<0 || y<0 || x>=n || y>=m) continue;
							//그림이 이어짐
							if(map[x][y]==1) {
								//크기++
								temp++;
								//확인
								map[x][y]=0;
								int[] arr1 = {x, y};
								//추가
								q.add(arr1);
								
							}
						}
					}
					//최대 크기 비교
					if(max_s<temp) max_s=temp;
				}
			}
		}
		System.out.println(cnt);
		System.out.println(max_s);
	}

}
