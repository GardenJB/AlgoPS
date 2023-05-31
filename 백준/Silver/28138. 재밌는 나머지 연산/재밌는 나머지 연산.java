import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수 n
		long n = sc.nextLong();
		
		//나머지 r
		long r = sc.nextLong();
		
		long sum =0;
		
		long div = n-r;
		
		//System.out.println(Math.sqrt(div));
		
        //div의 약수 구하기
		for(long m=1; m<=Math.sqrt(div); m++) {
			if(div%m==0) {
				if(n%m==r) sum+=m;
				long pair = div/m;
				//System.out.println(pair);
				if(pair !=m && n%pair==r) sum+=pair;
			}
		}
		
		//n이상에서 나머지 n 고정
//		for(long m=1; m<=n+1; m++) {
//			if(n%m==r) sum+=m;
//		}
		
		System.out.println(sum);
	}

}
