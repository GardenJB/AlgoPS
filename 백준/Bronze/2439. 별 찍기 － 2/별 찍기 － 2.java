import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=n-i; j>0; j--) {
                sb.append(" ");
            }
            for(int j=1; j<=i; j++){
                sb.append("*");
            }
            sb.append("\n");
            
        }
        System.out.println(sb);
    }
}