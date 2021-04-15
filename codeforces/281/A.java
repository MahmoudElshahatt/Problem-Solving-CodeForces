
import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author elsawah
 */
public class AWordCapitalization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner in=new Scanner(System.in); 
   String s=in.next();
   char[] c=s.toCharArray();
   c[0]= toUpperCase(s.charAt(0));
   System.out.println(c);
    }
    
}
