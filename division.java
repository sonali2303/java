import java.util.Scanner;
class division{
public static void main(String []args){\m
int i;
Scanner sc=new Scanner(System.in);
i=sc.nextInt(); 
if(i%3==0 && i%5==0)
{
System.out.println(" helloworld'");
}
else if(i%3==0)
{
System.out.println("hello'");
}
else if(i%5==0)
{
System.out.println("world");
}
else
{
System.out.println("default");
}
}
}