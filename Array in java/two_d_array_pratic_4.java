import java.util.Scanner ;
public class two_d_array_pratic_4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a[][]= new int[2][3];

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j]=input.nextInt();
            }
        }
    for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
