package inheritance.multilavle_inhreat;

public class C extends B {
    void result_(float Mark ){
        if (Mark > 79){
            System.out.println("You result is very good ");
        }else{
            System.out.println("You result is average");
        }
    }
    void display (){
        System.out.println("Name :"+ name);
        System.out.println("Name father :"+ father_name);
        System.out.println("Name :"+ reg);
        System.out.println("Name :"+ id  );
    }
    public static void main(String[] args) {
        C student1 = new C();
        student1.name = "Srk";
        student1.country = "Eurupe";
        student1.father_name = "Brk";
        student1.result_(80);

        student1.display();
    }

}
