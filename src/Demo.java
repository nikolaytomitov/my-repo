public class Demo {
	
	static void test() {
		System.out.println("Testvam nachalo!");
		vzriviSe();
		System.out.println("Testvam krai!");
	}
	
	private static void vzriviSe() {
		System.out.println("Vzriv nachalo!");
	
		grymni();
		
		System.out.println("Vzriv krai!");
	}

	private static void grymni() {
		System.out.println("Grymvane nachalo!");
		int x = 5 / 0; // throw new ArithmeticException("/ by zero")
		String s = null;
		System.out.println(s.length());
		System.out.println("Grymvane krai!");
	}

	public static void main(String[] args) {
		test();
	}
}
