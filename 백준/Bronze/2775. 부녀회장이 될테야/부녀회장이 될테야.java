import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case 반복
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			//층수 k
			int k=sc.nextInt();
			//호수 n
			int n = sc.nextInt();
			
			int[][] dp = new int[k+1][n+1];
			
			for(int i=0; i<=k; i++) {
				for(int j=1; j<=n; j++) {
					
					//0층
					if(i==0) dp[i][j]=j;
					else {
						//각층1호
						if(j==1) dp[i][j]=j;
						//같은 층의 이전 호수 값에 이전 층의 해당 호수 값을 더하기
						else dp[i][j]= dp[i][j-1]+dp[i-1][j];
					}
				}
			}
			System.out.println(dp[k][n]);
		}
	}

}
