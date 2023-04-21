import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		//**String.toLowerCase()
		s=s.toLowerCase();
		
		//**알파벳 26개
		int[][] alph = new int[26][2];
		for(int i=0; i<26; i++) {
			alph[i][0]=i;
		}
		for(int i=0; i<s.length(); i++) {
			
			alph[s.charAt(i)-'a'][1]++;
		}
		
		Arrays.sort(alph, (o1, o2)-> o1[1]-o2[1]);
		
		if(alph[25][1]==alph[24][1]) System.out.println("?");
		else System.out.println((char)(alph[25][0]+'A'));
	}

}
