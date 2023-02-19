3. Write a Java program to find N prime numbers reading N as
command line argument


class Prime
{
public static void main(String[] args)
{
int n,i,j,count;
n=Integer.parseInt(args[0]);
System.out.println("Prime Series are::");
for (i=2;i<=n ;i++ )
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
count++;
}
if(count==2)
{
System.out.println(i);
}
}
}
}
