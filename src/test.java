import java.util.Scanner;
public class test{

     public static void main(String[] args){
         System.out.println("Enter a no : ");
         Scanner input=new Scanner(System.in);
         int n=input.nextInt();
         if(n%2==0)
         System.out.println("Even no.");
         else
         System.out.println("Odd no.");
     }
        
}