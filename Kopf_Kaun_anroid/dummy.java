public class dummy {

	public static void main(String[] args) {
		int a = 6;
		int b = 7;
		int result = a * b;

		System.out.println("Das Ergebnis von " + a + " * " + b + " ist: " + result);
	}

	public void thisIsANewMethod() {
		int ctr = 0;
		for (int i = 0; i < 10; i++) {
			ctr++;
		}
		System.out.println("Counter: " + ctr);

		System.out.println("Fixed the bug!");
	}

	public void thisIsANewMethod2() {
		System.out.println("Hello World!");
	}
}
