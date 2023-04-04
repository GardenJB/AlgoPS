class Solution {
    public int solution(String my_string) {
        int answer =0;
		//my_string.replaceAll("[a-zA-Z]", ",");
		//String[]temp = my_string.split(",");
//		for(String s : temp) {
//			System.out.println(s);
//			//answer+=Integer.parseInt(s);
//		}
		String[]temp = my_string.split("[a-zA-Z]");
		for(String s : temp) {
			System.out.println(s);
			answer += s.isEmpty()? 0 :Integer.parseInt(s);
		}
        return answer;
    }
}