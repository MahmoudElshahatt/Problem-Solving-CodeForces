
import java.util.Scanner;

/**
 *
 * @author elsawah
 */
public class ABuyAShovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=1;   int n=0;
int k=in.nextInt();    int r=in.nextInt();
while(x>0)
{
if(x*k %10==0 ||x*k %10==r){
n=x;
break;
 }
x++;
}
  System.out.println(n);
    }
}
