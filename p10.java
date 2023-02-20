10. Write a Java program to demonstrate user defined packageprogram.
  
  
package mypack;
public class Addition
{
public double a,b;
public Addition(double a,double b)
{
this.a=a;
this.b=b;
}
public double sum()
{
return (a+b);
}
}




import mypack.Addition;
public class TestPack
{
public static void main(String[] args)
{
Addition a = new Addition(50.25,20.60);
System.out.println("Addition of two numbers::"+a.sum());
}
}
