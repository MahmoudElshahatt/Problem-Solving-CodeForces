
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
while(x>0)
{
res=x*k ;
if(res %10==0){
n=x;
break ;}
else if(res%10==r)
{
n=x;
break;
}
x++;
res=0;
}
  System.out.println(n);
  
    }
}
