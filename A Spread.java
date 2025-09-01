//Q1 Netflix
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0;i<n.length();i++){
      if(i==n.length()-1){
      sb.append(n.charAt(i));
      continue;
    }
    sb.append(n.charAt(i)+" ");
    }
    System.out.println(sb.toString());
  }
}
// Q 7 A Spread :
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0;i<n.length();i++){
      if(i==n.length()-1){
      sb.append(n.charAt(i));
      continue;
    }
    sb.append(n.charAt(i)+" ");
    }
    System.out.println(sb.toString());
  }
}        
