import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        
        try {
        	while(st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                System.out.println(a+b);
                st = new StringTokenizer(sc.nextLine());
            }
        }catch(Exception e) {
        	
        }
        
    }

}
