import java.lang.*;
import java.util.*;

public class BitwiseLeftRightShift {
    public static void main(String args[])
    {
        int x=0b1;
        int y,p,q,r,s;
        int a=0b1000;
        int b=0b1000;
        int c=-0b1010;            // (Right shift operator)
        int d=-0b1010;

        y=x<<1;
        p=a<<2;
        q=b>>1;
        r=c>>1;                   // (Without signed bit)
        s=d>>>1;                  // (With signed bit)

        System.out.println(y);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}
