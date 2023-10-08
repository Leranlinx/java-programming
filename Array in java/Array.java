public class Array {
    public static void main(String[] args) {
        int[] mylist = {1,2,3,200,4,5};
        // print all elements 
        for (int i=0 ; i<mylist.length; i++) {
            System.out.println("array item "+ mylist[i]);
        }
        // summing all elements 
        int sum = 0;
        for (int i=0 ; i<mylist.length; i++){
            sum = sum+mylist[i];
            System.out.println("My list all elements sum : "+sum);
        }
        //Find the big number 
        int max = mylist[0];
        for (int i=0; i<mylist.length ; i++) {
            if (mylist[i]>max){
                max= mylist[i];
            }
        }
        System.out.println("Max Item is: "+max);
    }
}
