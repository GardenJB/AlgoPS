import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
		Arrays.sort(arr);
        //순서 바꾸기**
		StringBuilder sb = new StringBuilder(new String(arr, 0, arr.length));
		answer = sb.reverse().toString();
        return answer;
    }
}