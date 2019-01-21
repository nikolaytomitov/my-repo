
public class LastikaSeSkysaException extends Exception {
	
	private static final long serialVersionUID = 3570171028747879340L;

	private int kolkoSymGoOpynal;
	private byte kolkoKamyniIma;
	
	public int getKolkoSymGoOpynal() {
		return kolkoSymGoOpynal;
	}

	public void setKolkoSymGoOpynal(int kolkoSymGoOpynal) {
		this.kolkoSymGoOpynal = kolkoSymGoOpynal;
	}

	public byte getKolkoKamyniIma() {
		return kolkoKamyniIma;
	}

	public void setKolkoKamyniIma(int i) {
		this.kolkoKamyniIma = (byte) i;
	}

	public LastikaSeSkysaException() {
		super();
	}

	public LastikaSeSkysaException(String message, 
			Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LastikaSeSkysaException(String message, Throwable cause) {
		super(message, cause);
	}

	public LastikaSeSkysaException(String message) {
		super(message);
	}

	public LastikaSeSkysaException(Throwable cause) {
		super(cause);
	}

}
