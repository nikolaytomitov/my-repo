public class Demo2 {
	
	public static void main(String[] args) {
		printArrayInfo(new int[3]);
	}

	private static void printArrayInfo(int[] a) {
		if (a == null || a.length < 3) return;
//		try {
			System.out.println(a.length);
			System.out.println(a[2]);
			System.out.println("Vsicho e tochno!");
//		}
//		catch(NullPointerException e) {
//			System.out.println("Hvanah NullPointer veche moga da spq spokoino!");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Hvanah AIOFBE veche moga da spq spokoino!");
//		}
	}
}
