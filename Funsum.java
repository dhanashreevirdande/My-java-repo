//Functions in java
import java.util.*;
public class Funsum{
public static int add(int a,int b)
{
    int sum=a+b;
    System.out.println("Sum="+sum);
    return sum;

}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st number:");
    int a = sc.nextInt();
    System.out.println("enter 2nd number:");
    int b = sc.nextInt();
    int sum=add(a,b);
    
}

}


