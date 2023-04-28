import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m= sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=m; i<=n; i++) {
			int cnt=0;
            if(i==1)continue;
			else {for(int j=2; j<=Math.sqrt(i); j++) {
				if(i!=j && i%j==0) cnt++;
				if(cnt==1) break;
				
			    }
            }
			if(cnt==0) System.out.println(i);
		}
	}

}
