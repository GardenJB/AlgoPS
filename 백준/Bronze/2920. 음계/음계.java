import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nums = new int[8];
        for(int i=0; i<8; i++) {
            nums[i] = sc.nextInt();
        }
      
            if(nums[0]<nums[1]) {
                  for(int i=1; i<7; i++) {
                        if(nums[i]>nums[i+1]) {
                            System.out.println("mixed");
                            break;
                        } else if(i==6) System.out.println("ascending");
                  }
            }else{
                 for(int i=1; i<7; i++) {
                     if(nums[i]<nums[i+1]) {
                        System.out.println("mixed");
                        break;
                     } else if(i==6) System.out.println("descending");
                 }
                 
            }
    }
}