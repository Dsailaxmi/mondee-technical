package projects;
abstract class car
{
	abstract void cost();
	abstract void milage();
	void steering()
	{
		System.out.println("Car has steering");
	}
}
abstract class bike
{
	abstract void cost();
	abstract void milage();
	void stand()
	{
		System.out.println("Bike has Stand");
	}
}
class audi extends car
{
	public void cost()
	{
		System.out.println("Audi cost is 20 Lakhs");
	}
	public void milage()
	{
		System.out.println("Audi milage is 10 KM");		
	}	
}
class glammer extends bike
{
	public void cost()
	{
		System.out.println("glammer cost is 1 Lakhs");
	}
	
	public void milage()
	{
		System.out.println("glammer milage is 10 KM");		
	}
	
}
public class Abstract {
	public static void main(String[] args) {
		
		audi obj;
		System.out.println("Car Details");
		obj=new audi();
		obj.cost();
		obj.milage();
		System.out.println("Bike Details");
		bike obj1;
		obj1=new glammer();
		obj1.cost();
		obj1.milage();
	}
}