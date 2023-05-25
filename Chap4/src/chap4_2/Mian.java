package chap4_2;

class A {
	String name;

	public A(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object deleted");

	}

}

public class Mian {
	public static void main(String[] args) {
		A ob = new A("Adarsh");
		System.out.println(ob);

		ob = null;
		System.gc();
		System.out.println(ob);

	}

}
