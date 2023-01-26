import java.lang.*;
import java.util.*;

public class BitwiseMaskingMerging {
    public static void main(String args[]) {
     /* byte a=9, b=12;
        byte c;

        c=(byte)(a<<4);
        c=(byte)(c|b);
     */
     // OR, We can also write like this. we don't need a and b we simply put the value of a and b.
        byte c;
        c=(byte)(9<<4);
        c=(byte)(c|12);

        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
    }
}
