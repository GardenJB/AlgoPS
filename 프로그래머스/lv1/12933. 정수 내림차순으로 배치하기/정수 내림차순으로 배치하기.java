import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String st = n+"";
        String[] arr = st.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        st = "";
        for(String k : arr) {
            st+=k;
        }

        // Integer[] arr2 = new Integer[arr.length];
        // for(int i=0; i<arr.length; i++) {
        //     arr2[i]=Integer.parseInt(arr[i]);
        // }
        // Arrays.sort(arr2, Collections.reverseOrder());
        // st = "";
        // for(int k : arr2) {
        //     st+=k;
        // }
        answer = Long.parseLong(st);
        return answer;
    }
}