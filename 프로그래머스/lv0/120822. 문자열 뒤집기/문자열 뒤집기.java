class Solution {
    public String solution(String my_string) {
        String answer;
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        for(int i=arr.length-1; i>=0; i--) {
            sb.append(arr[i]);
        }
        answer = sb.toString();
        
        return answer;
    }
}