import java.util.Scanner;
public class Solving_quadratic_equations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double a = input.nextDouble();
        System.out.print("Enter 2nd number : ");
        double b = input.nextDouble();
        System.out.print("Enter 3rd number : ");
        double c = input.nextDouble();
        double d = ((b*b)-4*a*c);

        if (d>0){
            double x1 = ((-b+Math.sqrt(d))/2*a);
            double x2 = ((-b-Math.sqrt(d))/2*a);
            System.out.println("The root is :" +x1 +" and "+x2);
        }
        else if (d==0){
            double x3 = (-b /(2*a));
            System.out.println("The root are : "+x3);
        }
        else {
            System.out.println("The root is not possible ");
        }
    }
}
