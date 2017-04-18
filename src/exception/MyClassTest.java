package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

	public static void test() {
		MyClass m = new MyClass();
		try {
			m.dangerousMethod();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  //try,catch문을 없애기 위해서 메소드 자체어서 exception을 던지는 경우도 있음.

}
