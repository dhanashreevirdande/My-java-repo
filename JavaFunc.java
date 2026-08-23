// java function
import java.util.*;
public class JavaFunc{
public static void printname(String name){
    System.out.println(name);
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your good name :");
    String name = sc.next();
    System.out.print("Hello Dear");
    printname(name);
}}