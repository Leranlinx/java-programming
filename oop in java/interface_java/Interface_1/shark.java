package interface_java.Interface_1;

public class shark implements Bird_2 {

    public void canFly_(){
        System.out.println("Shark is Flay!");
    }

    public int number_ (){
        int [] arr = {1,2,3,4,5};
        int sum = 0 ;
        for (int i =0 ; i<arr.length ;i++){
            sum = sum+i ;
        }
        System.out.println("Sum is : "+ sum);
        return sum ;
    }

    public void carsing_() {
        System.out.println("Shark is not singin! But shark is swinming.");
    }
}
