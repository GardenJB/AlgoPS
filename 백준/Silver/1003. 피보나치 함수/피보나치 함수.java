import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case 반복
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			//대상 순번 n
			int n = sc.nextInt();
			int[][] dp = new int[41][2];
			dp[0][0] = 1;
			dp[0][1] = 0;
			dp[1][0] = 0;
			dp[1][1] = 1;
			if(n>1) {
				for(int i=2; i<=n; i++) {
                    //호출 대상 누적값
					dp[i][0]=dp[i-2][0]+dp[i-1][0];
					dp[i][1]=dp[i-2][1]+dp[i-1][1];
				}
			}
			
			System.out.println(dp[n][0]+" "+dp[n][1]);
		}
	}

}
