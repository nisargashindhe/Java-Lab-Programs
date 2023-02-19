8. Write a program to illustrate Constructor Overloading


class StudDetails
{
String name;
int roll;
double per;
public StudDetails()
{
name="ABC";
roll=20;
per=60.00;
}
public StudDetails(String name,int roll, double per)
{
this.name=name;
this.roll=roll;
this.per=per;
}
public void display()
{
System.out.println("Name::"+name+"\n"+"Roll
No::"+roll+"\n"+"Percentage::"+per);
}
}
class TestStudent
{
public static void main(String[] args)
{
StudDetails s1=new StudDetails();
s1.display();
StudDetails s2=new StudDetails("XYZ",30,70.00);
s2.display();
  }
}
