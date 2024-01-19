import java.util.Scanner;

public class NumToText {
	private String[] belowTen = { "", "one", "Tow", "three", "For", "Five", "Six", "Seven", "Eight", "Nine"};
	private String[] belowTwenty = { "Ten", "Eleven", "Twelve", "Tirteen", "Forteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private String[] belowHundred =  {"", "Ten", "Twenty", "Thirty","Forty","Fifty","Sixty", "seventy","Eighty", "Ninety"};

	// Method -> 03 
	public String convertText (int val){
		if (val==0) {
			return "Zero" ;
		}
		return helper(val);
		}
	
		// Method ->02 
	public String helper (int val){
		String ans = new String();
		if (val < 10){
			return ans = ans + belowTen [val] ;
		}else if (val < 20 ){
			return ans += belowTwenty[val - 10] ;
		}else if (val < 100){
			return ans += belowHundred [val / 10] + " "+ helper(val % 10) ; 
		}
		return ans  ;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter int value : ");
		int A = input.nextInt();
		NumToText obj = new NumToText();
		String ans = obj.convertText(A);
		System.out.println(ans);
		input.close();
	}
	
}


