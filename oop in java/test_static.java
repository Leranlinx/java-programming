public class test_static {
    String name ;
    int id ;
    static java.lang.String university = "DUET";

    test_static (java.lang.String string, int i){
        name = string;
        id = i ;
    }

    void Displayout (){
        System.out.println("Name = "+name);
        System.out.println("Id = "+id);
        System.out.println("University = "+ university);
    }

    public static void main(String[] args) {
        test_static student_1 = new test_static("Md Nahimul Islam ", 1839);
        student_1.Displayout();
    }
}
