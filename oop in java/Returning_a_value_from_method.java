public class Returning_a_value_from_method {
    int squer (int number){
        return number * number ;
    }

    public static void main(String[] args) {
        Returning_a_value_from_method num_1 = new Returning_a_value_from_method();
        int resul = num_1.squer(5);
        System.out.println("Result = "+ resul);

    }
}
