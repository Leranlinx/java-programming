
import java.util.Scanner;
public class SumProgram 
{
    public static void main(String args[]){  
        Scanner num = new Scanner (System.in);
        System.out.print("Enter a random number = ");
        float a = num.nextInt();
        System.out.print("Enter a random number = ");
        float b = num.nextInt();

        float result = a +b ;

        System.out.println("The ans is "+result);


        
    } 
}