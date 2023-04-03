import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        
        Arrays.sort(be);
        Arrays.sort(af);
        
        String b = new String(be);
        String a = new String(af);
        
        if(b.equals(a)){
            answer =1;
        } else {
            answer =0;
        }
        return answer;
    }
}