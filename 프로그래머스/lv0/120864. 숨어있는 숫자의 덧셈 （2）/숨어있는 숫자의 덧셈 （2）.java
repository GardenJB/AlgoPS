class Solution {
    public int solution(String my_string) {
        int answer =0;
        //***replaceAll
		my_string = my_string.replaceAll("[a-zA-Z]", ",");
		String[]temp = my_string.split(",");
        //***split 결과
		for(String s : temp) {
			//System.out.println(s);
			if(!s.equals("")) answer+=Integer.parseInt(s);
		}
		// String[]temp = my_string.split("[a-zA-Z]");
		// for(String s : temp) {
		// 	//System.out.println(s);
		// 	answer += s.isEmpty()? 0 :Integer.parseInt(s);
		// }
        return answer;
    }
}