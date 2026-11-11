package q1;

class Emp{
	String name;
	int id;
	double sal;
	String address;
	public Emp(String name, int id, double sal, String address) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
	public void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(address);
		System.out.println(sal);
		// TODO Auto-generated method stub

	}
	
}

public class Main{
	public static void main(String[] args) {
		Emp emp = new Emp("bappi", 1, 220.0, "mumbai");
		System.out.println(emp);
		emp.displayInfo();
		
		
	}
}
//class Emp{
//	String name;int id;double sal;String address;
//
//	public Emp(String name, int id, double sal, String address) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.sal = sal;
//		this.address = address;
//	}
//
//	@Override
//	public String toString() {
//		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
//	}
//	public void displaInfo() {
//		System.out.println(name);
//		System.out.println(id);
//		System.out.println(sal);
//		System.out.println(address);
//		
//		// TODO Auto-generated method stub
//
//	}
//}
//public class Main {
//	public static void main(String[] args) {
//		Emp emp = new Emp("bappi", 123, 12.2, "mumbai");
//		System.out.println(emp);
//		emp.displaInfo();
//	}
//
//}