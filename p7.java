7. Write a program to demonstrate Single Inheritance.
  
  
import java.lang.*;
class Vehicle
{
String name;
int regNo;
double cost;
public Vehicle(String name, int regNo, double cost)
{
this.name=name;
this.regNo=regNo;
this.cost=cost;
}
public void display()
{
System.out.println("Vehicle Information::");
System.out.println("Name::"+ name +"\nRegistration
Number::"+regNo+"\n Cost::"+cost);
}
}
class Car extends Vehicle
{
int speed;
public Car(String name, int regNo,double cost,int speed)
{
super(name,regNo,cost);
this.speed=speed;
}
public void show()
{
super.display();
System.out.println("Car speed::"+speed);
}
}
class TestCar
{
public static void main(String[] args)
{
Car c=new Car("Maruthi",2022,100000,100);
c.show();
}
}
