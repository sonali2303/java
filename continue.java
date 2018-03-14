
import java.util.*;
Class Continue{
public static void main(String[]args)
{
Scanner sc =new Scanner(Sytem.in);
int i=1;
while(i<6)
{
String s1=sc.next();
if(i%2!=0)
{
i++;
continue;
}
System.out.println(s1);
i++;
}
}
}