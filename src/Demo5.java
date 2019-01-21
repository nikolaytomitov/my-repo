import java.awt.HeadlessException;
import java.lang.invoke.LambdaConversionException;
import java.security.KeyManagementException;
import java.text.ParseException;

import javax.management.openmbean.KeyAlreadyExistsException;

public class Demo5 {
	
	static void f() throws LastikaSeSkysaException, KeyManagementException, LambdaConversionException, HeadlessException, ParseException {
		System.out.println("Zdrasti!");
		
		if (Math.random() < 0.33) {
			LastikaSeSkysaException e = new LastikaSeSkysaException("Kupi si nov lastik");
			e.setKolkoKamyniIma(2);
			e.setKolkoSymGoOpynal(50);
			throw e;
		}
		if (Math.random() > 0.7) {
			throw new HeadlessException("Ostanah bez glava");
		}
	}
	
	public static void main(String[] args) {
		try {			
			f();
		}
		//java 7+
		catch (LastikaSeSkysaException e) {
			System.out.println("emi nqmam kysmet");
			System.out.println("Skysalo se s tolkova kamyni " + e.getKolkoKamyniIma());
		}		
		catch(HeadlessException e) {
			System.out.println("Nqmam glava!");
		}
		catch (Exception e) {
			System.out.println("Ne stana");
		}
		finally {
			System.out.println("Vsichko e strahotno");
		}
	}
}
