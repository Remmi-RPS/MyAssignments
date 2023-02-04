package week1.day1;

public class Mobile {
	public void makecall() {
		String mobileModel= "Oppo";
		float mobileWeight= 2.1f;
		System.out.println("Mobile Model -"+mobileModel);
		System.out.println("Mobile Weight - "+mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullyCharged= true;
		int mobileCost= 5000;
		System.out.println("Mobile Fully Charged - "+isFullyCharged);
		System.out.println("Mobile Cost - "+mobileCost);
		
	
	}
public static void main(String[] args) {
	Mobile b= new Mobile();
	b.makecall();
	b.sendMsg();
	System.out.println("This is my Mobile");
}
}
