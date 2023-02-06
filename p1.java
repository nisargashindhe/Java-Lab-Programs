// Write a java program to read the radius of a circle and to find the area and circumference

import java.util.Scanner;
import java.lang.*;
class Area
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
float r;
double area,cir;
System.out.println("Enter the radius of Circle::");
r=sc.nextFloat();
area=(3.142*r*r);
cir=(2*3.142*r);
System.out.println("Area of Circle with radius "+r+"is "+area);
System.out.println("Circumference of Circle with radius "+r+" is "+cir);
}
}