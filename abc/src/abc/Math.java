package abc;

import java.util.Arrays;

public class Math {
	public static int[] method()
	{
		int a1=1;
		int a2=2;
		int a3=3;
		
		return new int[] {a1, a2, a3};
		
	}
	
	public static Object[] func()
	{
		String name="abc";
		int age=2;
		double sal=3.25;
		
		return new Object[] {name, age, sal};
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints=method();
		Object[] details=func();
		System.out.println(details[1]);
		
		System.out.println(Arrays.toString(ints));
		System.out.println(Arrays.toString(details));
		
	}

}
