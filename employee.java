package week8b;
import java.util.Date;

public class employee{	
	String name;
	String address;
	Date Time;
	int age;
	double salary;
	
	public void print() {
		System.out.println("Name"+name);
		System.out.println("Name"+address);
		System.out.println("Name"+Time);
		System.out.println("Name"+age);
		System.out.println("Name"+salary);
		
	}
	public static void main(String[]args) {
		employee kuy = new employee();
		employee beb = new employee();
		kuy.address ="Jonh Cena";
		
		kuy.Time = new Date();
		
		kuy.salary = 20000;
		
		kuy.print();
				
		beb.name ="Phitayut";
		
		beb.print();
   }
	
}