class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] temp = my_string.toCharArray();
		for(char c : temp) {
			if(Character.isDigit(c))
				answer+=c-'0';
		}
        return answer;
    }
}