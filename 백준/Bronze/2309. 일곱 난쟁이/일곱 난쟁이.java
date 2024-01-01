import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//9 난쟁이 키 입력받기
		int[] nan = new int[9];
		int sum = 0;
		int key = 100;
		for(int i=0; i<9; i++) {
			nan[i] = sc.nextInt();
			//아홉 난쟁이 키의 총 합
			sum += nan[i];
		}
		
		//아닌 난쟁이 찾기
		int nonan1 = 0;
		int nonan2 = 0;
		outer:
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum - (nan[i] + nan[j]) == key) {
					nonan1 = i;
					nonan2 = j;
					break outer;
				}
			}
		}
		
		//일곱 난쟁이
		int[] ans_nan = new int[7];
		int k=0;
		for(int i=0; i<9; i++) {
			if( i != nonan1 && i != nonan2 ) {
				ans_nan[k] = nan[i];
				k++;
			}
		}
		
		//오름차순 정렬
		for(int i=0; i<6; i++) {
			for(int j=i+1; j<7; j++) {
				int temp = ans_nan[i];
				if(ans_nan[i] > ans_nan[j]) {
					ans_nan[i] = ans_nan[j];
					ans_nan[j] = temp;
				}
				
			}
		}
		
		for(int i=0; i<7; i++) {
			System.out.println(ans_nan[i]);
		}
	}
}
