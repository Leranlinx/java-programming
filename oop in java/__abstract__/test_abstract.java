package __abstract__;

public class test_abstract extends __abstract__{
    public void sum (){

    }
    public void add (){
        int a = 10 ; 
        int b = 20 ;
        System.out.println("Adding is : "+ a+b);
    }
    public static void main(String[] args) {
        test_abstract obj = new test_abstract();
        obj.add();
    }
}
