import java.util.*;
public class Arraytd{
    public static void main(String argss[]){
        Scanner sc  = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] num=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0; i<col;j++){
                num[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
{
    System.out.print(num[i][j]+" ");
}      
System.out.println();
  }
    }
}