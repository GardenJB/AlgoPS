import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] temp = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
            int cnt=0;
            for(char c : temp) {
                if(temp[i]==c)
                    cnt++;
            }
            if(cnt==1)
                answer+=temp[i];
        }
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);
        answer="";
        for(char c : arr) {
            answer+=c;
        }
        return answer;
    }
}