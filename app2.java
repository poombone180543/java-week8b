package week8b;

public class app2{
	public static void main(String[]args) {
		
		double a = 25;
		
		double yourhours =30;
		
		final double rate = 13.75;
		
		System.out.println("Google Assistan");
		
		Google(12,13.75);
		
		Google(a,13.75);
		
		Google(yourhours,13.75);
		
		System.out.println("by bestie");	
	}
	static void Google(double a , double rate) {
		
		System.out.println("Developer");
		
		//final double STD_RATE = 13.75;
		
		double gross;
		
		gross = a*rate;
		
		System.out.println(12 + " horus at $"+ rate +" total "+gross);
		
	}
	
}