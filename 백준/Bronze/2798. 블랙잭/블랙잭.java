import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//카드 수 n
		int n = sc.nextInt();
		//상한 m
		int m = sc.nextInt();
		
		//카드 수
		int[] cards = new int[n];
		for(int i=0; i<n; i++) {
			cards[i]=sc.nextInt();

		}
		
		int sum=0;
		int min_c = Integer.MAX_VALUE;
		
		for(int i=0; i<n-2; i++) {
			sum+=cards[i];

			if(sum>m) {
				sum-=cards[i];
				continue;
			}
			for(int j=i+1; j<n-1; j++) {
				sum+=cards[j];
				
				if(sum>m) {
					sum-=cards[j];
					continue;
				}
				for(int k=j+1; k<n; k++) {
					sum+=cards[k];
					
					if(sum>m) {
                        
                        //**
						if(j==n-2 && k==n-1) sum=0;
						else if(k==n-1) sum=cards[i];
						else sum-=cards[k];
						continue;
					}else {
						if(min_c>m-sum) min_c=m-sum;
						if(j==n-2 && k==n-1) sum=0;
						else if(k==n-1) sum=cards[i];
						else sum-=cards[k];
						
					}
				}
			}
		}
		System.out.println(m-min_c);
	}

}
