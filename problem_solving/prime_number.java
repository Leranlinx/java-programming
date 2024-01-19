import java.util.Scanner ;
public class prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter prime number length ");
        int prime_num = input.nextInt();
        int i,j ;

        for (i = 2 ;i<prime_num ; i++){
            for (j =2 ;j<i ; j++){
                if (i%j ==0 ){
                    break ;
                }
            }
            if (i == j){
                System.out.println( "\n"+i);
            }
        }


    }
}
