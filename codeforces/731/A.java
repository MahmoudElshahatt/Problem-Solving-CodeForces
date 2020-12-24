
import java.util.Scanner;

public class ANightAtTheMuseum {
    public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
String s=in.next();
   int moves=0;
   int p=0;
        for(int i=0;i<s.length();i++)
        {
        int index=s.charAt(i)-97;
        int walk=Math.abs(p-index);
        if(walk<=13)
             moves+=walk;
        else
            moves+=26-walk;
        p=index;
        }
        System.out.println(moves);
    }
    
}
