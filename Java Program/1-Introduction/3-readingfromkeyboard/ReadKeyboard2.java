package readingfromkeyboard;
import java.lang.*;
import java.util.*;

public class ReadKeyboard2 { 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        sc.useRadix(2);

        int x = sc.nextInt();
        System.out.println(x);
    }       
}
