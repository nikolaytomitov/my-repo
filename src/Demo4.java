
public class Demo4 {
	public static void main(String[] args) {
		try {
			proizvediMiKola();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	private static void proizvediMiKola() throws Exception {
		try {
			napraviMiGumi();
			napraviMiSedalki();
		}
		catch (Exception e) {
			//rethrow
			throw new Exception("Kolata ne stana, sorry!", e);
		}
	}

	private static void napraviMiSedalki() throws Exception {
		System.out.println("Pravq sedalki");
		if (Math.random() < 0.5) {
			throw new Exception("Ami ne stanaha gumite");
		}
	}

	private static void napraviMiGumi() throws Exception {
		System.out.println("Pravq gumi");
		try {
			dokaraiKauchuk();
			stopiGo();
		}
		catch(Exception e) {
			throw new Exception("Ne stanaha gumite", e);
		}
	}

	private static void stopiGo() throws Exception {
		System.out.println("Topq kauchuka i go pravq na guma");
		if (Math.random() < 0.5) {
			throw new Exception("Ami ne moga da go stopq studeno e navyn");
		}
	}

	private static void dokaraiKauchuk() throws Exception {
		System.out.println("Shte dokaram 1 kamion s kauchuk");
		if (Math.random() < 0.5) {
			throw new Exception("Kamiona se obyrna shtoto e hlyzgavo");
		}
	}
}
