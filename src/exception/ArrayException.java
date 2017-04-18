package exception;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] intArray = new int[5];
			intArray[0] = 0;

			for (int i = 0; i < 5; i++) {
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			} // 굳이 exception하지 않아도 try,catch를 하지 않아도 되는 것 : one checked
				// exception
				// 고쳐야 되는 exception
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
