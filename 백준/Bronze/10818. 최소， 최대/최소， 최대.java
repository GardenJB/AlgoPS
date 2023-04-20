import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        //**Integar.***_VALUE
        int min_n = Integer.MAX_VALUE;
        int max_n = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            if(min_n>a) min_n=a;
            if(max_n<a) max_n=a;
        }
        
        System.out.printf("%d %d", min_n, max_n);
    }
}