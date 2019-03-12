import java.util.Scanner;

public class BinaryConversion {
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      int start;
      int by7;
      int by6;
      int by5;
      int by4;
      int by3;
      int by2;
      int by1;
      int by0;
      
      
      System.out.print("Enter a whole number between 0 and 255.: ");
      start = sc.nextInt();
      System.out.println();
      
      int tmp = start;
      
      if(tmp - 128 >= 0) {
         by7 = 1;
         tmp -= 128;
         }
      else
         by7 = 0;
      
      if(tmp - 64 >= 0) {
         by6 = 1;
         tmp -= 64;
         }
      else
         by6 = 0;
      
      if(tmp - 32 >= 0) {
         by5 = 1;
         tmp -= 32;
         }
      else
         by5 = 0;
      
      if(tmp - 16 >= 0) {
         by4 = 1;
         tmp -= 16;
         }
      else
         by4 = 0;
      
      if(tmp - 8 >= 0) {
         by3 = 1;
         tmp -= 8;
         }
      else
         by3 = 0;
      
      
      if(tmp - 4 >= 0) {
         by2 = 1;
         tmp -= 4;
         }
      else
         by2 = 0;
      
      if(tmp - 2 >= 0) {
         by1 = 1;
         tmp -= 2;
         }
      else
         by1 = 0;
      
      if(tmp - 1 >= 0) {
         by0 = 1;
         tmp -= 1;
         }
      else
         by0 = 0;
      
      
      System.out.println("Your conversion is: " + by7 + by6 + by5 + by4 + by3 + by2 + by1 + by0);
   }
}