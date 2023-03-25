import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer="";
        String[] arr = my_string.toLowerCase().split("");
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        
        //arr이 char인 경우 : 가
        //answer = new String(arr);
        return answer;
    }
}