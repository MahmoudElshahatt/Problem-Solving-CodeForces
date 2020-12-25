
import java.util.Scanner;

/**
 *
 * @author elsawah
 */
public class AGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int numofgames=0;
        int n=in.nextInt();
        int[] x =new int[n];  
                int[] y =new int[n];  
  for(int i=0;i<n;i++){
{
x[i]=in.nextInt();  y[i]=in.nextInt();
}}
  for(int i=0;i<n;i++){
  for(int h=0;h<n;h++){
if(x[i]==y[h])
    numofgames++;
}
}
  System.out.println(numofgames);
  }    
    }