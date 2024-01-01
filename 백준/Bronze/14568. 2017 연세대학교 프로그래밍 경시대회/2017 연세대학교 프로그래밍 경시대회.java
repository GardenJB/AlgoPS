import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//총 사탕 수 n
		int n = sc.nextInt();
		
		int ans = 0;
		
		/* 사탕 규칙
		 * * 사탕 총 합
		 * a + b + c = n
		 * * 남규는 영훈보다 2개 이상 많
		 * a > = b+2
		 * * 택희가 받는 사탕의 수는 짝수
		 * c % 2 == 0 
		 * * 사탕 최대 수
		 * n>= 1 && n <= 100
		 * * 출력
		 * 만족 경우의 수 | 0
		 */

		if(n > 3) {
			for(int i=1; i<n; i++) {
				for(int j=1; j<n; j++) {
					for(int k=1; k<n; k++) {
						if( i+j+k == n) {
							if(i >= j+2) {
								if(k%2 == 0) ans++;
							}
						}
					}
				}
			}
		}
		
		System.out.println(ans);
		
	}
}
