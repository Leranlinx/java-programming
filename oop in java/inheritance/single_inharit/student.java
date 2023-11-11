package inheritance.single_inharit;

public class student extends Main{
    float result_mark ;
    void get_data (){
        roll = 19848;
        name = "Nahimul";
        result_mark = 98.50f ;
    }

    void display (){
        System.out.println("Roll : "+ roll);
        System.out.println("name : "+ name);
        System.out.println("Result mark : "+ result_mark);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }

}
