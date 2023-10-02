
import java.util.Scanner;
public class Triangle_area {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        float a = input.nextInt();
        float b = input.nextInt();
        float c = input.nextInt();

        if (((a+b)>c) && ((b+c)>a) && ((a+c)>b)){
            float s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Triangle area is : "+ area);
        }
        else{
            System.out.println("Triangle is not possible: ");
        }
    }
}
