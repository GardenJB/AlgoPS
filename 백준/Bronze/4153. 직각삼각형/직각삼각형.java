import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        do{
            int max_n = 0;
            int[] arr = new int[3];
            for(int i=0; i<3; i++) {
                arr[i]= Integer.parseInt(st.nextToken());
                if(max_n<arr[i]) max_n=arr[i];
            }
            int a = arr[0];
            if(a==0) break;
            
            int sum=0;
            for(int i=0; i<3; i++) {
                if(arr[i]==max_n) continue;
                sum+= arr[i]*arr[i];
            }
            if(max_n*max_n==sum) System.out.println("right");
            else System.out.println("wrong");
            
            st = new StringTokenizer(sc.nextLine());
        }
        while(st.hasMoreTokens());
        
        
    }
}