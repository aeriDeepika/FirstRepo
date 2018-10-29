package calculate;


public class Calculations extends Parameters {
	
	int a, b;


	public Calculations(String a2, String b2) {
	// TODO Auto-generated constructor stub
	int a = Integer.parseInt(a2);
	this.a=a;
	
	int b = Integer.parseInt(b2);
	this.b=b;
	
	}


	public int[] getA() {
	int add, sub, mul, div;
	add=a+b;
	sub=a-b;
	mul=a*b;
	div=a/b;
	
	return new int[] {add, sub, mul, div};
	
	}
	
}
