package q3;

public class A{
	public int a =10;
	private int b =10;
	protected int c =10;
	int d =10;
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		
	}
}
class B{
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.d);
		System.out.println(a.c);
	}
	
}
class  C extends A{
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.a);
		System.out.println(c.c);
		System.out.println(c.d);
		
	}
}


//public class A {
//	public int a = 10;	
//	private int b = 10;	
//	protected int c = 10;	
//	int d = 10;	
//	public static void main(String[] args) {
//		A  a  = new A();
//		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);
//		System.out.println(a.d);
//		
//	}
//}
//class B{
//	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a.a);
//		System.out.println(a.c);
//		System.out.println(a.d);
//		
//	}
//}

