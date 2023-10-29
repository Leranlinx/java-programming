package Constructor;

public class constructor_1 {
    String name,contact,gender;
    int id ; 

    constructor_1 (){
        System.out.println("no perameter connstructor");
    }
    constructor_1 (String n, int i){
        name = n ;
        id = i ; 
    }
    constructor_1 (String n, String c, int i ){
        name = n ; 
        contact = c ; 
        id = i; 
    }
    constructor_1 (String n, String c, int i, String g){
        name = n ; 
        contact = c ; 
        id = i; 
        gender = g; 
    }
    public void get_details (){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Contacet : "+contact);
        System.out.println("Id : "+id);
    }

    public static void main(String[] args) {
        constructor_1 st = new constructor_1();
        st.get_details();
        System.out.println("New student details ");
        constructor_1 st_2 = new constructor_1("Md Nahimul Islma", 123);
        st_2.get_details();
    }
}
