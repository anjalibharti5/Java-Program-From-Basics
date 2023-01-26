import java.lang.*;

public class IntegerLiteral1 {
    public static void main(String arg[])
    {
     // Decimal number system - (0,1,2,3,4,5,6,7,8,9)
        byte b1 = 10;

     // Binary number system -(0,1)
        byte b2 = 0b1010;

     // Octal number system - (0,1,2,3,4,5,6,7,10,11,12  ---> (In the octal number in the place of ('8' we write '10') and ('9' we write '11') and ('10' we write '12'))
        byte b3 = 012;

     // Hexadecimal number system - (0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F)
        byte b4 = 0XA;         //   ( 0XA = 0xA )

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
