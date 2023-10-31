package Variable;

public class instance_variable {
    int num ; // Instance Variable 
    instance_variable (int n ){
        num = n ;
    }
    // Method Make 
    public void show (){
        System.out.println("The instance number : " + num);
    }
    public static void main(String[] args) {
        instance_variable ins_obj = new instance_variable(100);
        ins_obj.show ();
    }

}
