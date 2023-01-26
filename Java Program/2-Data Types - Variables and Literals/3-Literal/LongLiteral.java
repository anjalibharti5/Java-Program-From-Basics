import java.lang.*;

public class LongLiteral {
    public static void main(String arg[])
    {
        // long l = 125;
        long l = 325;
        long l1 = 325L;            // (325L = 325l)        
        long l2 = 999999999999L;
        float f = 12.56f;
        double d = 12.56d;         // (12.56d and 12.56 both are equal)    

        // (If we have a bigger figure then we can seprate the digits by using ('_') or underscore not comma(,) because in java comma doesnt support.)
        long l3 = 999_999_999;     
        float f1 = 125_625- .56f;    

        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f);
        System.out.println(d);

        System.out.println(l3);
        System.out.println(f1);
    }
}
