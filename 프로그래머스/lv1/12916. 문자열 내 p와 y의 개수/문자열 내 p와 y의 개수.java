class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        int cnt_p=0;
        int cnt_y=0;
        for(char c : arr) {
            if(c=='p'||c=='P')
                cnt_p++;
            else if(c=='y'||c=='Y')
                cnt_y++;
        }
        if(cnt_p!=cnt_y) answer=false; 
        return answer;
    }
}