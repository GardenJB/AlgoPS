

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case 반복
		int t=10;
		for(int i=0; i<t; i++) {
			
			//n
			int n = sc.nextInt();
			
			//큐에 숫자열 넣
			Queue<Integer> q = new LinkedList<Integer>();
			for(int j=0; j<8; j++) {
				q.offer(sc.nextInt());
			}
			//사이클 상수 큐
			Queue<Integer> qc = new LinkedList<>();
			for(int j=1; j<=5; j++) {
				qc.offer(j);
			}
			
			//cycle 돌기
			//와 방법이 참 많다....
			//while(true)
			//int c=1; while(c>0)
			int c=1;
			do {
				int a = q.poll();
				int b = qc.poll();
				c = a-b;
				if(c<0) c=0;
				q.offer(c);
				qc.offer(b);
				
				if(c<=0) {
					System.out.printf("#%d ", i+1);
					for(int k=0; k<8; k++) {
						System.out.print(q.poll()+" ");
					}
					System.out.println();
				}
			} while(c>0);
		}
		sc.close();
	}
}
