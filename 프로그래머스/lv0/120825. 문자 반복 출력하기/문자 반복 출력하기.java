class Solution {
    public String solution(String my_string, int n) {
        String answer;
        StringBuilder sb = new StringBuilder();
        char[] temp = my_string.toCharArray();
        for(char c : temp) {
            for(int i=0; i<n; i++) {
                sb.append(c);
            }
        }
        answer=sb.toString();
        return answer;
    }
}