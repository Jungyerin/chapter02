package chapter02;

public class ArrayUtils {
	
	public static double[] intToDouble(int[] arr)
	{
		double[] darr=new double[arr.length];
				
		for(int i=0;i<arr.length;i++)
		{
			darr[i]=arr[i];
		}
		
		return darr;
	}
	
	public static int[] doubleToInt(double[] darr)
	{
		int[] arr=new int[darr.length];
		
		for(int i=0;i<darr.length;i++)
		{
			arr[i]=(int) darr[i];
		}
		
		return arr;
	}
	
	
	public static int[] concat(int[] arr1,int[] arr2) {
		int[] arr3=new int[arr1.length+arr2.length];
		int j=arr1.length;
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			arr3[j]=arr1[i];
			j++;
		}
		
		return arr3;
	}
	

}
