package Appendix_A;

public class LargestPalindrome {
    public static void main(String[] args){
        for (int x = 999; x >= 0; x--){
           for (int y = 999; y >= 0; y--){
               int z = y * x;
               if (is_palindrome(z)) {
                   System.out.println(z);
                   System.exit(0);
               }
           }
        }
    }

    public static boolean is_palindrome(int x){
        int temp1 = x;
        int temp2 = x;
        int count = 0;
        int buf = 0;

        while (temp1 > 0){
            temp1 = temp1 / 10;
            ++ count;
        }

        while(temp2 > 0) {
            int digit = temp2 % 10;
            temp2 = temp2 / 10;
            buf += digit * (int) Math.pow(10, --count);
        }

        return buf == x;
    }
}

