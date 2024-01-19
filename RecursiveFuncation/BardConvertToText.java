public class BardConvertToText {
    private static final String[] BELOW_TEN = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] BELOW_TWENTY = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] BELOW_HUNDRED = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String convertText(int val) {
        if (val == 0) {
            return "Zero";
        } else if (val < 10) {
            return BELOW_TEN[val];
        } else if (val < 20) {
            return BELOW_TWENTY[val - 10];
        } else if (val < 100) {
            return BELOW_HUNDRED[val / 10] + " " + convertText(val % 10);
        } else {
            throw new IllegalArgumentException("Number must be less than 100");
        }
    }
    public static void main(String[] args) {

    }
}
