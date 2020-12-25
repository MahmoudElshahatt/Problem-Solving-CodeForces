
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
        int x=1;  int res; int n=0;
int k=in.nextInt();    int r=in.nextInt();
while(true)
{
res=x*k ;
if(res %10==0 ||res%10==r){
n=x;
break ;}
x++;
res=0;
}
  System.out.println(n);
    }
}
