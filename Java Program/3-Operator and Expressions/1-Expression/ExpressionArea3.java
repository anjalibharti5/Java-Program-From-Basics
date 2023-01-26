import java.lang.*;
import java.util.*;
import java.io.*;

public class ExpressionArea3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int length,breadth,height;
        int totalArea,volume;

        System.out.println("Enter the value of length, breadth and height");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        totalArea = 2*((length*breadth)+(breadth*height)+(height*length));
        volume = (length*breadth*height);

        System.out.println("Total area of cuboid is "+totalArea);
        System.out.println("Volume of cuboid is "+volume);
    }
}
