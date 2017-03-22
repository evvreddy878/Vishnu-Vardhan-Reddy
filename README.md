# Vishnu-Vardhan-Reddy
Tasks QA

package saibersys.qa.java;

public class javabasics {
	
	public static void main(String args[]){
		javabasics obj1 = new javabasics();
		obj1.noreturn();
		obj1.noreturnparameter(10);
		System.out.println(obj1.withreturn());
		String str=obj1.withreturnparameter(20);
		System.out.println(str);
		staticmethod();
		try{
			System.out.println(1/0);
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("try block has 1/0 so it will throw exception");
		}
	}
	
	public static void staticmethod(){
		System.out.println("this is a static method");
	}
	
	public void noreturn(){
		System.out.println("Void method with no parameters");
	}
	
	public void noreturnparameter(int x){
		System.out.println("voidmethod with parameter x = "+x);
	}
	public String withreturn(){
		return "return method with no parameters";
	}
	
	public  String withreturnparameter(int x){
		return "return method with parameter x = "+x;
	}
}
