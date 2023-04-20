import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        
        int ans=0;
        //**st.hasMoreTokens() 복수형
        while(st.hasMoreTokens()) {
            //**token 소비하기
            st.nextToken();
            ans++;
        }
        
        System.out.println(ans);
    }
}