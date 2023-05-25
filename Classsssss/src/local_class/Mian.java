package local_class;

class A{
	
	void meth() {
		
		int X= 4656;
		class B {
			void meth2() {
				System.out.println(X);
			}
		}
		B b = new B();
		b.meth2();
		
	}
	
}


public class Mian {
	public static void main(String[] args) {
		A a = new A();
		a.meth();
	}

}
