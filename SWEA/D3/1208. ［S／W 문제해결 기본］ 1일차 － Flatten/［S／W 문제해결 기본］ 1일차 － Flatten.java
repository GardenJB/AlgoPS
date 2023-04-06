import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//test case
		int t=10;
		for(int i=0; i<t; i++) {
			//dump 
			int n=sc.nextInt();
			//상자 배열
			int[] box = new int[100];
			for(int j=0; j<100; j++) {
				box[j]=sc.nextInt();
			}
			
			//선택정렬
			for(int j=0; j<=n; j++) {
				for(int a=0; a<99; a++) {
					int minidx =a;
					for(int b=a+1; b<100; b++) {
						if(box[b]<box[minidx]) {
							minidx =b;
						}
					}
					int temp = box[minidx];
					box[minidx]=box[a];
					box[a] = temp;
				}
				if(j != n) {
					box[0]++;
					box[99]--;
				}
			}
			int ans = box[99]-box[0];
			System.out.printf("#%d %d \n", i+1, ans);
			
		}
		sc.close();
	}

}