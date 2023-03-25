class Solution {
    public String solution(String my_string, String letter) {
        String answer ;
        StringBuilder sb = new StringBuilder();
        char[] temp = my_string.toCharArray();
        for(char c : temp ) {
            if(c!=letter.charAt(0))
                sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}