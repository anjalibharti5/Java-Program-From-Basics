import java.lang.*;
import java.io.*;

public class ArithmeticPrecedence {
    public static void main(String args[]) 
    {
        System.out.println(10+20/2);
        System.out.println((10+20)/2);
        System.out.println(10/2*5);
        System.out.println(10/(2*5));
    }
}
