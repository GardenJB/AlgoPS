class Solution {
    public String solution(String my_string) {
        String answer="";
        
        /* String과 char 구별
        * 조건 > String에 같은 원소가 여러번?
        * || vs | 전자는 조건 만족 경우 바로 중지
        */
        
        //answer = my_string.replaceAll("[aeiou]","");
        //answer = my_string.replaceAll("a|e|i|o|u", "");
        String[] vow = {"a", "e", "i", "o", "u"};
		for(String v : vow) {
			if(my_string.contains(v)) {
				my_string = my_string.replace(v, "");
			}
		}
        answer = my_string;
        return answer;
    }
}