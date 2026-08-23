import java.util.*;
public class Stringbuild{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("DhanaSree");
        sb.setCharAt(0, 'S');
        System.out.println(sb);
        System.out.println( sb.insert(0, 'f'));
        System.out.println( sb.delete(1, 5));
        //sb.append(" virdande");
        System.out.println( sb.length());
        System.out.println(sb.append(" virdande"));


    }
}
