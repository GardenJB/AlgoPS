import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        int[] temp = new int[arr.length];
        int k=0;
        for(int a : arr) {
            if(a%divisor==0) {
                temp[k]=a;
                k++;
            }
        }
        if(k==0) {
            answer = new int[1];
            answer[0]=-1;
        }else {
            answer = new int[k];
            answer = Arrays.copyOf(temp, k);
            Arrays.sort(answer);
        }
       
        return answer;
    }
}