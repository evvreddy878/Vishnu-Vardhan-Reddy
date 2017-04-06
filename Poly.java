package polymorphism;

public class Poly {

	public static void main(String[] args)
	
	{
		Poly hey=new Poly();
		hey.add(25, 42);
		hey.add(44, 65, 33);
		hey.add(43.45, 23.32);
		hey.add(45, 87.99);
		hey.add(66.98, 34);
	}
		public void add(int a, int b)
		{
			int c= a+b;
			System.out.println("The result of the sum is:"+c);
		}
		public void add(int a, int b,int c)
		{
			int d= a+b+c;
			System.out.println("The result of the sum is:"+d);
				}
		public void add(double a, double b)
		{
			double f= a+b;
			System.out.println("The result of the sum is:"+f);
		}
		public void add(int a, double b)
		{
			double h= a+b;
			System.out.println("The result of the sum is:"+h);
		}
		public void add(double b,int a)
		{
			double i= a+b;
			System.out.println("The result of the sum is:"+i);
		}

}
