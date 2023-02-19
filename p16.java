16. Write a Java program demonstrating Exception Handling.
  
  
import java.util.Scanner;
class Sorting
{
public static void main(String args[])throws Exception
{
try
{
Scanner d=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n,temp,j;
n=d.nextInt();
int a[]=new int[n+1];
System.out.println("Enter the array elements");
for(int i=1;i<=n;i++)
{
a[i]=d.nextInt();
}
for(int i=1;i<=n;i++)
for(j=i+1;j<=n;j++)
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
System.out.println("Sorted Array elements are");
for(int i=1;i<=n;i++)
{
System.out.println(" "+a[i]);
}
}
catch(Exception e)
{
System.out.println("Enter only integervalues");
}
}
}
