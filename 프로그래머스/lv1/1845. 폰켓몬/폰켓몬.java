import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums) {
            hs.add(i);
        }
        answer = hs.size()>nums.length/2 ? nums.length/2 : hs.size();
        return answer;
    }
}