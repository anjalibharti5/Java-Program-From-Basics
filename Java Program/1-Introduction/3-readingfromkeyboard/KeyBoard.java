package readingfromkeyboard;
import java.lang.*;
import java.util.*;
public class KeyBoard {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("May I know your name ?");
        name = s.nextLine();
        System.out.println("Welcome Mr./Miss " + name);
    }
}
