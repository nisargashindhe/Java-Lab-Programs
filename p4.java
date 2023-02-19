4. Write a program to find a factorial of number reading input
as command line argument


class Fact
{
public static void main(String[] args)
{
int fact=1,n,i;
n=Integer.parseInt(args[0]);
for (i=1;i<=n ;i++ )
{
fact=fact*i;
}
System.out.println("Factorial of "+n+":"+fact);
}
}
