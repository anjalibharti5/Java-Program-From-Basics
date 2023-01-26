import java.lang.*;
import java.util.*;
import java.io.*;

public class IncDec1 {  
    public static void main(String[] args) {
        int x=5, y=4, z;

        z = 2 * x++ + 3 * ++x;
        //((2 * 5) + (3 * 7)) = 31
        System.out.println(z);
    }
}
