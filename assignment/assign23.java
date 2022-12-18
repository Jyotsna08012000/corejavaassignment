package Assignment;
class A{
	public void Class1() {
		System.out.println("This is a parent class");
	}
}
class B extends A{
	public void Class2() {
		System.out.println("This is chile class");
	}
}



	

public class assign23 {
	public static void main(String[] args) {
		A a= new A();
		a.Class1();
		B b= new B();
		b.Class2();
		b.Class1();
	}

}
