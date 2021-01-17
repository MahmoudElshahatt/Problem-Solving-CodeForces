
import java.util.Scanner;

/**
 *
 * @author elsawah
 */
public class ALinelandMail {

    
    public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
 int n=in.nextInt(); int max=0,min=0;
 int[] lc=new int[n];
 for(int i=0;i<n;i++)
 {
 lc[i]=in.nextInt();
 }
  for(int i=0;i<n;i++){
 if(i==0){
  min=Math.abs(lc[i]-lc[i+1]);
max=Math.abs(lc[i]-lc[n-1]); }
 else if(i==n-1)
   {
 min=Math.abs(lc[i]-lc[i-1]);
max=Math.abs(lc[i]-lc[0]); 
  }
else
{
 min=Math.min(Math.abs(lc[i]-lc[i+1]),Math.abs(lc[i]-lc[i-1]));
max=Math.max(Math.abs(lc[i]-lc[n-1]),Math.abs(lc[i]-lc[0]));
        }
     System.out.println(min+" "+max);  
   max=0; min=0; 
  }
    }
    
}
