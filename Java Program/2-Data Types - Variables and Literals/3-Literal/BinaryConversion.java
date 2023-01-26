import java.lang.*;
import java.io.*;

public class BinaryConversion {
    public static void main(String arg[])
    {
        int a = 6;
        int b = -6;
        System.out.println(Integer.toBinaryString(a));          // (6 means we have to do 1's compliment)
        System.out.println(Integer.toBinaryString(b));         // (-6 means we have to do 2's compliment and the size is 32)
    }
}
