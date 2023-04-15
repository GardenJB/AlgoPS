import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//대상 수 n
		int n = sc.nextInt();
		
		int[]dp = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			if(n==1) break;
			else {
				//**1일때 값
				if(i==1) continue;
				//** 1뺀 수와, 2로 나눈 수와, 3으로 나눈 수에서 횟수 추가
				dp[i]=dp[i-1]+1;
				if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
				if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
			
		}
		System.out.println(dp[n]);
	}
}
