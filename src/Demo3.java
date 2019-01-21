import java.io.IOException;

public class Demo3 {
	
	public static void main(String[] args) {
		try {
			procheti();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void procheti() throws IOException {
		char x = daiMiZnak();
		System.out.println(x);
	}

	private static char daiMiZnak() throws IOException {
		char x = (char) System.in.read();
		return x;
	}
}
