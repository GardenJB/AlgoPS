import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] a = new int[emergency.length];
        for(int i=0; i<emergency.length;i++){
            a[i] = emergency[i];
        }
        Arrays.sort(a);
        
        for(int i =0;i <a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]==emergency[j]){
                    answer[j]=emergency.length-i;
                }
            }
        }
        return answer;
    }
}