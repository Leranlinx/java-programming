package Student_details;

public class test {
    String name, contact;
    int id;
    int age ;

    test (String n, String c, int i , int age){
        this.name = n;
        this.contact= c;
        this.id = i;
        this.age = age ;
    }

    public void setName (String name ){
        this.name = name ;
    }
    
    public String getname (){
        return this.name;
    }

    public void getContact (String contact){
        // this.name = name ;
    }

    public String setContact (){
        return this.contact;
    }

    public void setid (int id){
        this.id=id ;
    }

    public int getid (){
        return this.id ;
    }

    public void setage (int age ){
        this.age= age ;
    }
}
