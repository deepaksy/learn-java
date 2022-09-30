package oops.inheritance;
class Base{
	Base(){
		System.out.println("Base class");
	}
	@Override
	public String toString() {
		return "Base Class toString method.";
		
	}
	
	public void display() {
		System.out.println("Base class Display method.");
	}
}
public class SingleInheritance extends Base {
	@Override
	public void display(){
		System.out.println("Derived class Display method.");
	}

	@Override
	public String toString(){
		return "Derived class toString method.";
	}
	public static void main(String[] args){
		SingleInheritance obj=new SingleInheritance();
		Base obj1=new SingleInheritance();
		obj.display();
		obj1.display();
		System.out.println(obj.toString());
		System.out.println(obj1.toString());

	}
}
