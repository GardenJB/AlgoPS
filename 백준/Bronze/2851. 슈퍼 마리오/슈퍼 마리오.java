import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int max_s=0;
		for(int i=0; i<10; i++) {
			int temp = sc.nextInt();
			sum+=temp;
			//합이 100 초과 시점 멈추고 비교
			if(sum>100) {
				max_s = sum-100<= 100-(sum-temp) ? sum : sum-temp;
				break;
				
			//총 합이 100이하인 경우***
			}else if(i==9)
				max_s = sum;
		}
		
		System.out.println(max_s);
	}

}
