public class Main {


    public static boolean isPalindrome(int x) {
        int temp, tersSayi = 0, kalan;
        temp = x;

        while (temp != 0) {
            kalan = temp % 10;
            tersSayi = tersSayi * 10 + kalan;
            temp /= 10;

        }
        if (x == tersSayi)
            return true;
        else {
            return false;
        }
    }

    public static boolean isPerfectNumber(int num) {
      if(num<=0){
          return false;
      }
      int total=0;
      for( int i=1; i<=num/2 ;i++){
          if(num % i== 0){
             total+=i;
          }
      }
    return total== num;

    }

    public static String numberToWords(int number) {
        if(number<0){
            return "Invalid Value";
        }
        String text="";
        char[] numberArray = String.valueOf(number).toCharArray();
        for (char digit : numberArray){
            switch (digit){
                case '0':
                    text +="Zero";
                    break;
                case '1':
                    text +="One";
                    break;
                case '2':
                    text +="Two";
                    break;
                case '3':
                    text +="Three";
                    break;
                case '4':
                    text +="Four";
                    break;
                case '5':
                    text +="Five";
                    break;
                case '6':
                    text +="Six";
                    break;
                case '7':
                    text +="Seven";
                    break;
                case '8':
                    text +="Eight";
                    break;
                case '9':
                    text +="Nine";
                    break;


            }
        }
        return text.trim();

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));

    }
}