package anomonus;

class A {
	void meth1() {
		System.out.println("this is meth 1");
	}
}
abstract class B{
	abstract void meth2();
}
interface C{
	void meth3();
}

public class Main {
	public static void main(String[] args) {
		
		A a = new A() {@Override
		void meth1() {
			// TODO Auto-generated method stub
			super.meth1();
		}};
		
		B b = new B() {
			
			@Override
			void meth2() {
				System.out.println("this is meth 2");

				
			}
		};
		
		
		C c = new C() {@Override
		public void meth3() {
			System.out.println("this is meth 3");

			
		}};
		
		
		a.meth1();
		b.meth2();
		c.meth3();
		
		
		
		
		
		
		
	}

}
