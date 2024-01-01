import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //계수 A, B
    int a = sc.nextInt();
    int b = sc.nextInt();

    //정답 배열
    int[] ans = new int[2];
    int k=0;
      //** 
    for(int i=-10000; i<10000; i++) {
      if( i*i +2*a*i + b == 0 ) {
        ans[k] = i;
        k++;
      } 
    }

    if(k == 2) System.out.print(ans[0]+" "+ans[1]);
    else System.out.println(ans[0]);
  }
}