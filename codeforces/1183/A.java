
import java.util.Scanner;

/**
 *
 * @author elsawah
 */
public class ANearestInterestingNumber {

  
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in); 
       int n=in.nextInt();  int number=0;
       for(int i=n;i<=1003;i++)
       {
      if(((getSum(i))%4==0)) {
         number=i;
          break;}
       }
       System.out.println(number);
       
    }
    
    public static int getSum(int n)
    {    
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
      
    return sum;
    }
    
}
