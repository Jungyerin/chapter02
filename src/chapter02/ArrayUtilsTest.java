package chapter02;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		int[] intArray={10,20,30,40,50};
		
		double[] dArray=ArrayUtils.intToDouble(intArray);
		
		for(double v : dArray)  //확장 for문 foreach문
		{
			System.out.print(v);
			System.out.print(" ");
		}
		System.out.println("");
		
		double[] dArray2={10.1,20.2,30.3,40.4,50.5};
		int[] intArray2=ArrayUtils.doubleToInt(dArray2);
		
		for(int v : intArray2)  //확장 for문 foreach문
		{
			System.out.print(v);
			System.out.print(" ");
		}
		System.out.println("");
		
		int[] intArray3=ArrayUtils.concat(intArray,intArray2);
		
		for(int v : intArray3)  //확장 for문 foreach문
		{
			System.out.print(v);
			System.out.print(" ");
		}
		System.out.println("");
	}

	

}
