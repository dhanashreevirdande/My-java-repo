//concatenating strings in java
import java.util.*;
public class Jstrins{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fname="Dhanashree";
        String cname="Dhanashree";
        String lname="virdande";
        String numstr="385";
        String fullname=fname+" "+lname;
        System.out.println("Name: "+fullname);
        System.out.println("Length of string : "+fullname.length());
       /*  for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
       if(fname.equals(cname)){
        System.out.println("fname and cname sting are equal");
       }
       else{
        System.out.println("fname and cname are not equal");
       } */
      //SUBSTRING
      System.out.println("Substring output:"+fname.substring(5));
      int num =Integer.parseInt(numstr);
      System.out.println(num);
    }

}