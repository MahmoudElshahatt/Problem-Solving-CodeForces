

import java.util.Scanner;
public class ANewPassword {

    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();  int k=in.nextInt();
 char[] al={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
String pass="";
if(n>=k){
for(int i=0;i<k;i++)
{
pass+=al[i];
}
for(int i=0;i<(n-k);i++)
 for(int l=0;l<k;l++)
{
 if(pass.length()==n)
     break;
 else
pass+=al[l];
}
}
else{
for(int i=0;i<n;i++)
{
pass+=al[i];
}
}
System.out.println(pass);
}
}