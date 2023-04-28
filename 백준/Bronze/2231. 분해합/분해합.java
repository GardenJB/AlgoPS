
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		outer :
		for(int i=1; i<=n; i++) {
			int sum=i;
			//**변수 주의 무한반복
			int k=i;
	
			while(k>0) {
				sum+=k%10;
				k/=10;
	
			}
			if(sum==n) {
				System.out.println(i);
				break outer;
			}else if(i==n) System.out.println(0);
			
		}
	}

}
