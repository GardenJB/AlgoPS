class Solution {
    public long solution(long n) {
        long answer = 0;

		while(answer * answer < n){
			answer++;
		}

		if(answer * answer == n){
			answer++;
			answer*=answer;
		}else{
			answer = -1;
		}
        
        //시간 초과 *** 형변환, 다른 변수 활용 w??? 
        
        // long answer = 0;
        // int i=1;
        // while(i*i<n){
        //     i++;
        // }
        // if(i*i==n)
        //     answer=(i+1)*(i+1);
        // else
        //     answer=-1;
        
        //시간 초과
        
        // for(int i=1; i<=n; i++) {
        //     if(i*i==n){
        //         answer=(i+1)*(i+1);
        //         break;
        //     }
        // }
        // if(answer==0) answer=-1;
        
        return answer;
    }
}