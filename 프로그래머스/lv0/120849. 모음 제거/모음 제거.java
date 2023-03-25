class Solution {
    public String solution(String my_string) {
        String answer="";
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