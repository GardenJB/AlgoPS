import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        
        //수열의 수 n
        int n = sc.nextInt();
        //대상 수 x
        int x = sc.nextInt();
   
        for(int i=0; i<n; i++){
            int a=sc.nextInt();
            if(a<x) s+=a+" ";
        }
        
        System.out.println(s);
    }
}