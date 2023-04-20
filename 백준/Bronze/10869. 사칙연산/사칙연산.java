import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        sb.append((a+b)+"\n");
        sb.append((a-b)+"\n");
        sb.append((a*b)+"\n");
        sb.append((a/b)+"\n");
        sb.append((a%b)+"\n");
        System.out.println(sb);
        
    }
}