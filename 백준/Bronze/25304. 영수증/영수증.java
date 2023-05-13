import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//총 금액 x
		int x = sc.nextInt();
		
		//구입 물건 수 n 반복
		int n = sc.nextInt();
		
		//계산 금액
		int sum=0;
		for(int i=0; i<n; i++) {
			//물건 가격
			int a = sc.nextInt();
			
			//구입 개수
			int b = sc.nextInt();
			
			sum+=a*b;
		}
		
		//비교
		if(x==sum) System.out.println("Yes");
		else System.out.println("No");
	}

}
