import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //**정수 int, long / 실수 float, double
        int n = sc.nextInt();
        double max_s =0;
        Double[] score = new Double[n];
        for(int i=0; i<n; i++) {
            score[i]=sc.nextDouble();
            if(max_s<score[i])  max_s = score[i];
        }
        double sum=0;
        for(double sco : score) {
            sum+= (sco/max_s)*100;
        }
        
        
        System.out.println(sum/n);
    }
}