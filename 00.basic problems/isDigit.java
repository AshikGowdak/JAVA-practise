public class isDigit {
    public static void main(String[] args) {
        boolean result = checkIsDigit("12395");
        if (result) {
            System.out.println("it is a digit");
        } else System.out.println("it is not a digit");
    }


  public static boolean checkIsDigit (String input) {
        boolean res = true;     // assume it's a digit
        for (int i = 0; i < input.length(); i++)
            if (input.charAt(i) < '0' || input.charAt(i) > '9') {         // check each character
                res = false;
                break;
            }
        return res;
    }
}




//output

//enter the input: 12395
//it is a digit