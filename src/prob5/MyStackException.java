package prob5;

public class MyStackException extends ArrayIndexOutOfBoundsException {
	private static final long serialVersionUID = 1L;

	public MyStackException() {
		super("prob4.MyStackException:stack is empty");
	}
	
	public MyStackException(String msg) {
		super(msg);
	}
}
