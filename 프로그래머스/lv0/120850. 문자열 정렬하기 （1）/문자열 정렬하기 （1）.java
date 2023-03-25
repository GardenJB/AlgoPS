import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer;
        //숫자만 담을 임시 배열
        int[] nums = new int[my_string.length()];
        //임시 배열 인덱스
        int cnt=0;
        for(int i=0; i<my_string.length(); i++) {
            //문자열 원소가 숫자인 경우
            if(Character.isDigit(my_string.charAt(i))) {
                //형변환 > 임시 배열 추가
            	nums[cnt]=(int) (my_string.charAt(i)-'0');
            	cnt++;
            }         
        }
        //배열 복사
        answer = Arrays.copyOfRange(nums, 0, cnt);
        //정렬 오름차순
        Arrays.sort(answer);
        return answer;
    }
}