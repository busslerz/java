import java.util.Scanner;

public class NameFizzBuzz {
   public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      int lin = 0;
      String fName = "";
      String lName = "";
      
      System.out.println("Hi There, I'm The Fizz Buzz of Names");
      System.out.print("How many lines would you like to see?: ");
      lin = sc.nextInt();
      System.out.println();
      
      System.out.print("What is your first name?: ");
      fName = sc.next();
      System.out.println();    
      System.out.print("What is your last name?: ");
      lName = sc.next();
      
      for(int i = 1 ; i <= lin; i++) {
         System.out.print(fName + " ");
            
         if(i % 5 == 0){
            System.out.print(lName);
            }
            
         System.out.println();
      }
   }

}