
import java.util.Scanner;
public class A_2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,numA=0,numD=0;
         n=input.nextInt();
        String s=input.next();
        for(int i=0;i<n;i++)
        {
       if(s.charAt(i)=='A')
            numA++; 
            else
            numD++;
        }
        if(numA>numD)
        System.out.println("Anton");
        else if(numA<numD)
                System.out.println("Danik");
                    else
              System.out.println("Friendship");
}
}
