import java.util.*;

public class NamePrint {
    public static void main(String args[])
    {
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("May I know Your Name");
        name = sc.nextLine();
        //name = sc.next();

        System.out.println("Welcome " +name + ".");
    }
}
