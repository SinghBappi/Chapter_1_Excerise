package q4_q5;



class Accountant{
	public  void calSal(double sal) {
		System.out.println(sal);
		
		// TODO Auto-generated method stub

	}
	public  void calSal(double sal,int bonus) {
		System.out.println(sal+bonus);
		// TODO Auto-generated method stub

	}
}
class Manager extends Accountant{
	@Override
	public void calSal(double sal) {
		// TODO Auto-generated method stub
//		super.calSal(sal);
		System.out.println(sal);
		
	}
}
public class Main{
	public static void main(String[] args) {
		Accountant accountant = new Accountant();
		Manager  manager= new Manager();
		accountant.calSal(2000);
		accountant.calSal(2000, 2000);
		manager.calSal(99999);
		
	}
}
//class Accountant{
//	public void calSal(double sal) {
//		System.out.println(sal);
//		
//		// TODO Auto-generated method stub
//
//	}
//	public void calSal(double sal , int bonus) {
//		System.out.println(sal+bonus);
//		// TODO Auto-generated method stub
//
//	}
//}
//class Manager extends Accountant{
//	@Override
//	public void calSal(double sal) {
//		System.out.println(sal);
//		// TODO Auto-generated method stub
////		super.calSal(sal);
//	}
//}
//public class Main {
//	public static void main(String[] args) {
//		Accountant accountant = new Accountant();
//		Manager  manager =  new Manager();
//		accountant.calSal(200);
//		accountant.calSal(300.0, 9);
//		manager.calSal(409);
//		
//	}
//	
//
//}
