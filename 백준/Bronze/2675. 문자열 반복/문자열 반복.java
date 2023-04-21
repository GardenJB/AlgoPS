import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++) {
            int r = sc.nextInt();
            String s = sc.next();
            
            String ans="";
            for(int j=0; j<s.length(); j++) {
                 for(int i=0; i<r; i++) {
                    ans+=s.charAt(j);
                }
            }
           System.out.println(ans);
        }
    }
}