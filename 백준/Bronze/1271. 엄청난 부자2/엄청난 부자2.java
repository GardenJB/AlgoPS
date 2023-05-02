import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        BigInteger a = n.divide(m);
        BigInteger b = n.remainder(m);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}