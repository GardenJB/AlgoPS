import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=sc.nextLine();
        char[] arr = s.toCharArray();
        
        int sum=0;
        for(char c : arr) {
            sum+=(int) (c-'0');
        }
        
        System.out.println(sum);
    }
}