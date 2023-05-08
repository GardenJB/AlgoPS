import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(sc.nextLine());
            arr[i][0]= Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0]==o2[0])
                return o1[1]-o2[1];
            else return o1[0]-o2[0];
        });
        
        StringBuilder sb = new StringBuilder();
        for(int[] ar : arr) {
            sb.append(ar[0]+" "+ar[1]+"\n");
        }
        System.out.println(sb);
            
    }
}