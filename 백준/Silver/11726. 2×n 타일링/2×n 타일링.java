import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//2*n n
		int n = sc.nextInt();
		
		int[] dp = new int[n+1];
		for(int i=1; i<=n; i++) {
			dp[1]=1;
			if(i==2) dp[2]=2;
			if(i>=3) dp[i] = (dp[i-1]+dp[i-2])%10007;
		}
		System.out.println(dp[n]);
	}

}