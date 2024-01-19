public class My_Stack {
    int capacity = 3;
    int top = -1 ;
    int stack [] = new int[capacity];

    void push (int x){
        if (top < capacity-1){
            top += 1 ;
            stack[top] =x ;
            System.out.println("Successfully added!"+ x);
        }else{
            System.out.println("Error! Stack overfolw.");
        }
    }

    int pop(){
        if (top <0 ){
            System.out.println("Stack underflow.");
            return -1 ;
        }
        int val = stack [top] ;
        top = top -1 ; 
        return val; 
    }

    int peek (){
        if (top <0 ){
            System.out.println("Stack underflow.");
            return -1 ; 
        }
        return stack[top] ; 
    }
    public static void main(String[] args) {
        My_Stack obj = new My_Stack();
        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println(obj.peek());
    }
}
