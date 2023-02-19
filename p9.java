9. Write a program to illustrate Method Overriding


class Bike
{
public void run()
{
System.out.println("Bike is running...");
}
}
class Honda extends Bike
{
public void run()
{
System.out.println("Honda bike is running....");
}
}
class TestBike
{
public static void main(String[] args)
{
Honda h=new Honda();
h.run();
}
}
