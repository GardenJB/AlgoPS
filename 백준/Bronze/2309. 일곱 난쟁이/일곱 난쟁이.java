import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int []num = new int[9];
        int sum = 0;
        for(int i=0;i<9;i++){
            num[i] = Integer.parseInt(bf.readLine());
            sum += num[i];
        }
        
        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if(sum - (num[i] + num[j]) == 100){
                    num[i] = 0;
                    num[j] = 0;
                    Arrays.sort(num);
                    for(int k=2;k<9;k++){
                        System.out.println(num[k]);
                    }
                    return;
                } 
            }
        }
    }
}