import java.lang.*;
import java.util.*;

public class BitwiseDemo {
    public static void main(String args[])
    {
     // int x=10, y=6,z;

        int x=0b1010;
        int y=0b0110;
        int z,a,b;

        z=x&y;          // (AND Operation)
        a=x|y;         //  (OR Operation)
        b=x^y;        //  (XOR Operation)

        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        
    }
}
