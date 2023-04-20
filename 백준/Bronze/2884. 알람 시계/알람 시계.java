import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        if(m-45<0) {
            int temp = m-45;
            m=60+temp;
            h=h-1<0? 23 : h-1; 
        }else m=m-45;
        
        System.out.println(h+" "+m);
    }
}