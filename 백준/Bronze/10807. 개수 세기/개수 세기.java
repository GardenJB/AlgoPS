import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수 개수 n
		int n = sc.nextInt();
		
		//정수 담기
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		
		//찾을 대상 v
		int v = sc.nextInt();
		
		int cnt =0;
		for(int num : nums) {
			if(num==v) cnt++;
		}
		
		System.out.println(cnt);
	}

}
