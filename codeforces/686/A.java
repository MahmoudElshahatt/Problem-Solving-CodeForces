


import java.util.Scanner;

/**
 *
 * @author elsawah
 */
public class AFreeIceCream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
 int n=in.nextInt();   long x=in.nextInt();
  int dchild=0;
 for(int i=0;i<n;i++)
 { String s =in.next(); int pass=in.nextInt();
 if(s.equals("+"))
 { x+=pass; } 
 else if(s.equals("-"))
 {if(pass<=x)
 x-=pass;
 else{
     dchild++;}
 }
 }
 System.out.println(x+" "+dchild);
    }
    
}
