import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case t 반복
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			//대상 수 n
			int n = sc.nextInt();
			int ans=0;
			int[]dp = new int[n+1];
			for(int i=1; i<=n; i++) {
				if(n==1) {
					ans=1;
					break;
				}
				if(n==2) {
					ans=2;
					break;
					
				}
				//**
				if(n==3) {
					ans=4;
					break;
				}
				dp[1]=1;
				dp[2]=2;
				dp[3]=4;
				//**
				if (i>3)
					dp[i]= dp[i-1]+dp[i-2]+dp[i-3];
			}
			if(n>3)ans=dp[n];
			
			System.out.println(ans);
		}
	}

}
