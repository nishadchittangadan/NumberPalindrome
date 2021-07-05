public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println("------------------");
        System.out.println(isPalindrome(122));
        System.out.println("------------------");
        System.out.println(isPalindrome(-313));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;

        if(number < 0){
            number *= -1;
        }
        int num = number;
        while(num > 0){
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        System.out.println(number);
        System.out.println(reverse);

        if(reverse == number){
            return true;
        } else {
            return false;
        }
    }

}
