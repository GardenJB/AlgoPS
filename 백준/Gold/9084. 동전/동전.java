import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case 반복
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			//동전 가지수 
			int n = sc.nextInt();
			int[] coin =  new int[n];
			for(int i=0; i<n; i++) {
				coin[i]=sc.nextInt();
			}
			
			//만들 금액
			int m = sc.nextInt();
			
			//dp
			int[] dp = new int[m+1];
            //***자기자신의 경우를 위해서 dp[0] 원소를 채워야 함
			dp[0]=1;
			for(int i=0; i<n; i++) {
				for(int j=1; j<=m; j++) {
					if(j-coin[i]>=0)
                        //동전의 금액만큼 이전으로 돌아간다
						dp[j]+=dp[j-coin[i]];
				}
			}
			
			System.out.println(dp[m]);
		}
	}

}
