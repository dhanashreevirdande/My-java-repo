/* to display solid square
*****
*****
*****
***** */
import java.util.*;
public class Patsolidsquare{
    public static void main(String args[]){
        int n=4;
        int m=5;
        //outer loop /rows
        for(int i =1;i<=n;i++){
            //inner loop /cols
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
           System.out.println();
        }
        
    }
}