package exception;

public class MyException extends Exception {
	
	private static final long serialVersionUp=1L;
	
	public MyException(){
		super("MyException Occur");
	}

	public MyException(String MyException){
		System.out.println();
	}
}
