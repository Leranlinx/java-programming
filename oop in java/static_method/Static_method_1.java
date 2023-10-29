package static_method;

public class Static_method_1 {

    void display1 (){
        System.out.println("I am none static method ");
    }
    static void display2 (){
        System.out.println("I am static method");
    }

    public static void main(String[] args) {
        Static_method_1 st = new Static_method_1();
        Static_method_1 st_2 = new Static_method_1();
        st_2.display2();
        st.display1();
        
        // Direct call .... kono object make kora lage nai.
        Static_method_1.display2();
    }
}
