
package calculuscalculator;
import java.util.Scanner;
public class CalculusCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String equ;
        System.out.println("make a selection"+"\n");
        System.out.println("enter (1) for a linear equation");
        System.out.println("enter (2) for a product function");
        System.out.println("enter (3) for a quotient function");
        System.out.println("enter (4) for an implicit function");
        System.out.println("enter (5 ) for finding order and degree of a differential equation");
        System.out.println("enter (6) for partial differential equation");
        System.out.println("enter (7) for first order differential equation");
        int n = input.nextInt();
        if (n==1){
            System.out.println("enter the equation");
            equ = input.next();
           /* int number = 10;
            boolean even = number % 2 == 0;
            System.out.println(even);*/
        }
        
    }
    
}
