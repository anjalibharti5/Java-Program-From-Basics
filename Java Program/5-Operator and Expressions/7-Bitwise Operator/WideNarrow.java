import java.lang.*;
import java.util.*;

public class WideNarrow {
    public static void main(String args[]) {
        byte b=10;
        short s=10;
        int i=10;
        long l=10;
        float f=10;
        double d=10;
        char c=10;
        boolean bl=true;

        b=(byte)s;               // (Typecasting)
        s=b;
        i=b;
        l=b;
        f=b;
        d=b;
        c=(char)b ;            // (Typecasting)
        bl=bl;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bl);
    }
}
