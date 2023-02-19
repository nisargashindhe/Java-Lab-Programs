2. Write a program to demonstrate String Operators


import java.lang.*;
class StringOperation
{
public static void main(String[] args)
{
String s1="kle bca";
String s2="college";
System.out.println("Length::"+s1.length());
System.out.println("Uppercase::"+s1.toUpperCase());
System.out.println("Concatination::"+s1.concat(s2));
System.out.println("Char AT::"+s1.charAt(2));
System.out.println("Equals::"+s1.equals(s2));
System.out.println("Substring::"+s1.substring(3));
System.out.println("Substring::"+s1.substring(3,6));
System.out.println("Replace::"+s1.replace('c','b'));
System.out.println("Index Of::"+s2.indexOf('l'));
char a[]=s2.toCharArray();
for (int i=0;i<a.length;i++ )
{
System.out.println(a[i]);
}
}
}
