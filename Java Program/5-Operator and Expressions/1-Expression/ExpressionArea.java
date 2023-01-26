import java.lang.*;
import java.util.Scanner;

public class ExpressionArea {
    public static void main(String args[]) 
    {
        float base, height, area;
        System.out.println("Enter Base and Height ");

        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        // area = 1f/2f*base*height;
        area = base*height/2;

        System.out.println("The area of the triangle is " +area);
    }
}