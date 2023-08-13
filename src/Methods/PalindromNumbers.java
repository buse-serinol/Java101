package basics.src.Methods;

public class PalindromNumbers {
      static boolean isPalindrom(int number) {
         int temp = number, reverseNummber = 0, lastNumber;
         while (temp != 0){
            lastNumber = temp % 10;
            reverseNummber = (reverseNummber * 10 ) + lastNumber;
            temp /= 10;
         }
         if (number == reverseNummber)
         return true;
         else
            return false;
      }

   public static void main(String[] args) {
      System.out.println(isPalindrom(101));
   }
   }
