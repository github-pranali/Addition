import java.util.*;
public class Addition2{
    public static void main(String[] args){
        int a=0,b=0,sum=0;
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a value for a");
         a = Sc.nextInt();
        System.out.println("Enter a value for b");
         b = Sc.nextInt();

        sum=a+b;

        System.out.println("\nAddition of "+a+" & "+b+" is: "+sum);
    }
}