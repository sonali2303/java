class pyramid{
public static void main (String[] args){
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4-i;j++)
{
System.out.print(" ");
}
for(int k =1;k<=i;k++)
{
System.out.print("* ");
}
System.out.println(" ");
}
}
}
