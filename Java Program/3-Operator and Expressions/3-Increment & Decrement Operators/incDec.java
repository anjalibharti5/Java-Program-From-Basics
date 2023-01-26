import java.lang.*;
import java.io.*;
import java.util.*;

public class IncDec {
    public static void main(String[] args) {
     /* 
        int x=5;
        x++;
        ++x;
        System.out.println(x);
     */

        int x=5,y;
        // y = x++;
        y = ++x;
        System.out.println(x+" "+y);         // OR,  System.out.println("The value of X and Y is  " +x+ "  " +y);
    }
}
