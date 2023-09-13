
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//a*a + n = b*b
		int n = sc.nextInt();
		
		int ans =0;
		
		for(int i=1; i<=500; i++) {
			for(int j=1; j<=500; j++) {
				if(i <= j && i*i +n == j*j) ans++;
			}
		}
		
		System.out.println(ans);
	}
}
