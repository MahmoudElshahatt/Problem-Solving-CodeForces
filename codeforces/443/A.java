import static java.lang.Character.isLowerCase;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author elsawah
 */
public class AAntonAndLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 String a =input.nextLine();  int c=0;
 Set<Character> se =new HashSet<Character>();
 for(int i=0;i<a.length();i++)
 {
 if(isLowerCase(a.charAt(i)))
 se.add(a.charAt(i));
 }
System.out.println(se.size());


    }
    
}
