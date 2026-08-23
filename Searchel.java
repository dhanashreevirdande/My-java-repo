//searching element 
import java.util.*;
public class Searchel{
public static void main(System args[]){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int [][] num=new int [row][col];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            num[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enetr Element to search :");
    int x=sc.nextInt();
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(num[i][j]==x){
                System.out.println("The element x is found at location : "+i+","+j);
            }
        }
    }
}}