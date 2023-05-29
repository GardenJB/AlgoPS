import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//바구니 n
		int n = sc.nextInt();
		//반복 수 m
		int m = sc.nextInt();
		
		int[] arr = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i]=i;
		}
		
		for(int k=0; k<m; k++) {
			int i= sc.nextInt();
			int j=sc.nextInt();
			
            //바구니 뒤집기 (중간 지점까지 교환)
			int b=0;
			for(int a=i; a<=i+(j-i-1)/2; a++) {
				int temp = arr[a];
				arr[a]=arr[j-b];
				arr[j-b]=temp;
				b++;
				
			}
		}
		
		for(int i=1; i<=n; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
