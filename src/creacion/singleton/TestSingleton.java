package creacion.singleton;

public class TestSingleton {

	Singleton s1, s2;

	public TestSingleton() {
		this.s1 = Singleton.getInstancia();
		this.s2 = Singleton.getInstancia();
	}

	public void test() {

		System.out.print("s1: ");
		System.out.println(this.s1.hashCode());
		System.out.print("s2: ");
		System.out.println(this.s2.hashCode());
		System.out.println("--------------------COMPROBACION---------------\n" + "    s1 == s2      : "
		        + (this.s1 == this.s2) + "\n");
	}

	public static void main(final String[] args) {

		final TestSingleton prueba = new TestSingleton();
		prueba.test();
	}
}
