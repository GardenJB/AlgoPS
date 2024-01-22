import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();	
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N; i++)
            list.add(Integer.parseInt(st.nextToken()));

        int m_id = 0, p_id = N-1;	
        int n1 = 0, n2 = 0;
        int max = Integer.MAX_VALUE;
        while(m_id < p_id){
            int temp = list.get(m_id) + list.get(p_id);
            if(max > Math.abs(temp)){	
                max = Math.abs(temp);
                n1 = list.get(m_id);
                n2 = list.get(p_id);
            }
            if(temp > 0)
                p_id--;
            else if(temp < 0)
                m_id++;
            else{	
                n1 = list.get(m_id);
                n2 = list.get(p_id);
                break;
            }
        }
        bw.write(n1 + " " + n2);
        bw.flush();		
        bw.close();
        br.close();


    }
}