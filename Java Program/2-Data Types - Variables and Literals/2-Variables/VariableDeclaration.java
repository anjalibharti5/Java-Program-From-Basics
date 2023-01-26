import java.lang.*;

public class VariableDeclaration {
    public static void main(String arg[])
    {
    // 1. CASE SENSITIVE 
        int b;
        int B;

    // 2. Contains ALPHABET, NUMBERS, _ , $ . 
        int room1;
        int roll_number;
        int roll$number;

    // 3. Start with ALPHABET, _ , $ .
        int $x;

    // 4. Should not be a keyword.
        //float int; 

    // 5. Should not be a class name, if class is also in use.
        int String = 10;
        //System.out.println(String);

    // 6. No limit on length of name
        int number$of$student$in$cse$dept;
        
    // 7. Follow Camel Cases.
        int rollNumberOfStudent;
        float averageMarksOfClass;

        System.out.println("b");
        System.out.println("B");

        System.out.println("room1");
        System.out.println("roll_number");
        System.out.println("roll$number");

        System.out.println("$x");

        System.out.println(String);

        System.out.println("number$of$student$in$cse$dept");

        System.out.println("rollNumberOfStudent");
        System.out.println("averageMarksOfClass");

    }
}
