package gobalclass;


class A {
	
	private int A = 542;
	
	class B{
		void meth () {
			System.out.println(A);
		}
	}
}



public class Main {
	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B();
		b.meth();
		
		
		
	}

}
