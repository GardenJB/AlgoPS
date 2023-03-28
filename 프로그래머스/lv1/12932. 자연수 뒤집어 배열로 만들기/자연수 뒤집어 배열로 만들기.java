class Solution {
    public int[] solution(long n) {
        String st = n+"";
        int l = st.length();
        int[] answer = new int[l];
        char[] temp = st.toCharArray();
        for(int i=l-1; i>=0; i--) {
            answer[l-i-1] = (int) temp[i]-'0';
        }
        
        return answer;
    }
}