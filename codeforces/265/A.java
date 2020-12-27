

import java.util.Scanner;

public class AColorfulStonesSimplifiedEdition {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       String s=input.next(); int ans=0;
       String t=input.next();
for(int i=0;i<t.length();i++)
{ if(t.charAt(i)==s.charAt(ans))
ans++;  
}
 System.out.println(ans+1);
        
    }
    
}
