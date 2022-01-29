package projects;
interface Vehicle
{
	void cost();
	void milage();
}
abstract class Car implements Vehicle
{
	void steering()
	{
		System.out.println("Car has steering");
	}
}
abstract class Bike implements Vehicle
{
	void stand()
	{
		System.out.println("Bike has Stand");
	}
}

class Audi extends Car
{
	public void cost()
	{
		System.out.println("Audi cost is 10 Lakhs");
	}

	public void milage()
	{
		System.out.println("Audi milage is 10 KM");		
	}
	
}
class glammer extends Bike
{
	public void cost()
	{
		System.out.println("glammer cost is 1 Lakhs");
	}
	
	public void milage()
	{
		System.out.println("glammer milage is 50 KM");		
	}
	
}

public class Interface {
	public static void main(String[] args)
	{		
		Car obj=new Audi();
		Bike obj1=new glammer();
		System.out.println("car details:");
		System.out.println("audi car details :");
		obj.steering();
		obj.cost();
		obj.milage();
		System.out.println("bike details");
		System.out.println("glammer bike details");
		obj1.stand();
		obj1.cost();
		obj1.milage();
	}
}

/*interface Animal {
	  void animalSound(); 
	  void sleep(); 
	}
	class cat implements Animal {
	  void animalSound() {
	    System.out.println("The cat says: meow meow");
	  }
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}

	class Interface {
	  public static void main(String[] args) {
	    cat obj = new cat();  
	    obj.animalSound();
	    obj.sleep();
	  }
	}*/