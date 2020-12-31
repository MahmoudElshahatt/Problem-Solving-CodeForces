
import java.util.Scanner;

/**
 *
 * @author elsawah
 */
public class ADieRoll {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        int m; int r=0;
int x=input.nextInt(); int y=input.nextInt();
     m=Math.max(x, y);
     r=(6-m)+1;
switch(r)
{
    case 1:
      System.out.println("1/6"); break;
case 2:
      System.out.println("1/3"); break;
case 3:
      System.out.println("1/2"); break;
case 4:
      System.out.println("2/3"); break;
case 5:
      System.out.println("5/6"); break;
case 6:
      System.out.println("1/1"); break;




}        
    }
    
}
