import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        String ans ="";
        for(int i=2; i>=0; i--) {
            if((a.charAt(i)-'0')>(b.charAt(i)-'0')) {
                ans+=a;
                break;
            }else if((a.charAt(i)-'0')<(b.charAt(i)-'0')){
                ans+=b;
                break;
            }
        }
        for(int i=2; i>=0; i--) {
            System.out.print(ans.charAt(i));
        }
    }
}