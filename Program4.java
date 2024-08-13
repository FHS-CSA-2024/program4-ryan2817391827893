//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class program4{
public static void main(String[] args){
    
    int[] n = new int[4];
    Scanner numScanner = new Scanner(System.in);
    
    System.out.println("enter first number");
    n[0] = numScanner.nextInt();
    
    
    System.out.println("enter second number");
    n[1] = numScanner.nextInt();
   
    
    System.out.println("enter third number");
    n[2] = numScanner.nextInt();
    
    
    System.out.println("enter fourth number");
    n[3] = numScanner.nextInt();
   
    
    int sum = n[0]+n[1]+n[2]+n[3];
    double ave = sum/4.0;
    
    System.out.println("...");
    System.out.println();
    System.out.println("sum is " +sum);
    System.out.println();
    System.out.println("average is " +ave);
    
    
    
    
}
}
//Paste console output below:
/*
enter first number
475
enter second number
821
enter third number
369
enter fourth number
562
...

sum is 2227

average is 556.75

*/
