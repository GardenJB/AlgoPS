import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//측정일수 n, 연속 k일
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		//온도배열
		int[] temp = new int[n];
		for(int i=0; i<n; i++) {
			temp[i] = sc.nextInt();
		}
		
		//최대값
		int max_temp = Integer.MIN_VALUE;
		for(int i=0; i<=n-k; i++) {
			int sum =0;
			for(int j=i; j<i+k; j++) {
				sum += temp[j];
			}
			if(max_temp< sum) max_temp = sum;
		}		
		System.out.println(max_temp);
	}

}
