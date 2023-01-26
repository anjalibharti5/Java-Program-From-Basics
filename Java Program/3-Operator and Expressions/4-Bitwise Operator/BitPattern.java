import java.lang.*;
import java.util.*;

public class BitPattern {
    public static void main(String args[])
    {
        int x=-0b1010;
        int p=-0b1010;
        int q=0b1010;

        int y,a,b;

        y=x>>1;
        a=p>>>1;                // (Right shift with Signed bit)
        b=~q;

        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(y)));

        System.out.println(String.format("%s",Integer.toBinaryString(p)));
        System.out.println(String.format("%s",Integer.toBinaryString(a)));
        System.out.println(String.format("%32s",Integer.toBinaryString(a)));   //(we want to display zero then we want to add 32places.)

        System.out.println(String.format("%s",Integer.toBinaryString(q)));
        System.out.println(String.format("%s",Integer.toBinaryString(b)));
        System.out.println(b);
    }
}
