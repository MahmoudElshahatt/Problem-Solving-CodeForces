import java.util.Scanner;

public class ABlackSquare {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cal=0;
int [] n={in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};    
        String s=in.next();
         for(int i=0;i<s.length();i++)
         {
         if(s.charAt(i)=='1') cal+=n[0];
         if(s.charAt(i)=='2') cal+=n[1];
         if(s.charAt(i)=='3') cal+=n[2];
         if(s.charAt(i)=='4') cal+=n[3];
         }
         System.out.println(cal);
    }
    
}
