public class NumberToString {
    
	final String[] belowTen = {"", "One", "Two","Three", "Four","Five","Six","Seven", "Eight", "Nine"};	
	final String[] belowTwenty = {"Ten", "Eleven", "Twelve","Thirteen","Forteen","Fifteen", "Sixteen","Seventeen", "Eighteen", "Nineteen"};
	final String[] belowHundred = {"", "Ten", "Twenty", "Thirty","Forty","Fifty","Sixty", "seventy","Eighty", "Ninety"};
	
	public String convertText(int val) {
		if(val == 0) {
			return "Zero";
		}
		return helper(val);
	}
	public String helper(int val) {
		String ans = new String();
		if(val < 10) {
			return ans += belowTen[val] + " ";
		}else if(val < 20) {
			return ans += belowTwenty[val - 10] + " ";
		}else if(val < 100) {
			return ans += belowHundred[val/10] + " " + helper(val % 10);
		}
		return ans;
	}

	public static void main(String[] args) {
		BardConvertToText cTt = new BardConvertToText();
		int num = 88     ;
		String ans = cTt.convertText(num);
		System.out.println(ans);
	}
}