import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//계단 수 n 반복
		int n = sc.nextInt();
		
		int[] score = new int[n+1];
		for(int i=1; i<=n; i++) {
			score[i]= sc.nextInt();
			
		}
		
		int[] dp = new int[n+1];
		for(int i=1; i<=n; i++) {
			if(i==1) dp[i]=score[i];
			else if(i==2) dp[i]=Math.max(dp[1]+score[i], score[i]);
			else if(i==3) dp[i]=Math.max(score[1]+score[i], score[2]+score[i]);
			//1칸을 먼저 내려가면 그 다음 1칸을 더 내려갈 수 없음.
			else dp[i] = Math.max(dp[i-2]+score[i], dp[i-3]+score[i-1]+score[i]);
		}
		
		System.out.println(dp[n]);
	}

}
