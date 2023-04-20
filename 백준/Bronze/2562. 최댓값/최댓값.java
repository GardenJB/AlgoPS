import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max_n = Integer.MIN_VALUE;
        int midx=0;
        for(int i=1; i<=9; i++) {
            int a = sc.nextInt();
            if(max_n<a) {
                max_n=a;
                midx=i;
            }
        }
        System.out.printf("%d %d\n", max_n, midx);
    }
}