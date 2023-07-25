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

    public static void numberToWords(int number) {
        if(number<=0){
            System.out.println("Invalid Value");
        }


    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(-12));
    }
}