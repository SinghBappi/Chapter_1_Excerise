package q2;
class Emp{
	String name;
	int id;
	static String dept;
	static double sal;
	public void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		
		// TODO Auto-generated method stub

	}
	public static void showInfo() {
		System.out.println(dept);
		System.out.println(sal);
		// TODO Auto-generated method stub

	}
	
}
class Main{
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.displayInfo();
		Emp.showInfo();
		
	}
}


//class Emp {
//	String name;
//	int id;
//	static String dept;
//	static double sal;
//
//	public void displayInfo() {
//		System.out.println(name);
//		System.out.println(id);
//
//		// TODO Auto-generated method stub
//
//	}
//
//	public static void showInfo() {
//		// TODO Auto-generated method stub
//		System.out.println(dept);
//		System.out.println(sal);
//
//	}
//}
//
//public class Main {
//	public static void main(String[] args) {
//		Emp emp = new Emp();
//		emp.displayInfo();
//		Emp.showInfo();
//	}
//
//}
