public class triangle {
    private int  length ;
    private int width ;
    private int height ;

    public triangle (int l, int w , int h){
        this.length= l;
        this.width = w ;
        this.height = h ;
    }
    public double display (){
        int result = height * width *length ; 
        return result;

    }
    public static void main(String[] args) {
        
    }
}
