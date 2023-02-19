6. Write a Java program to illustrate Method Overloading.
  
  
import java.util.Scanner;
class MethodOverload
{
public double add(double a, double b)
{
return (a+b);
}
public double add(double a, double b, double c)
{
return (a+b+c);
}
}
class TestOverload
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
MethodOverload m=new MethodOverload();
double p,q,r;
System.out.println("Ethe the values::");
p=sc.nextDouble();
q=sc.nextDouble();
r=sc.nextDouble();
System.out.println("Addition of "+p+" and "+q+" is
"+m.add(p,q));
System.out.println("Addition of "+p+" and "+q+" and
"+r+" is "+m.add(p,q,r));
}
}
