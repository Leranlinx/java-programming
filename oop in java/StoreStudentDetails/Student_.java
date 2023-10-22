package StoreStudentDetails;
public class Student_ {
    private String name ;
    private int id ;
    private String contact ; 

    public Student_(){
        
    }

    public Student_(String name, int id, String con){
        this.name = name;
        this.id = id;
        this.contact = con;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setContact(String con){
        this.contact = con;
    }

    public String getContact(){
        return this.contact;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

}
