package pizza;
class plane{
	void takeoff() {
		System.out.println("plane took off");
	}
	void fly() {
		System.out.println("plane flying");
	}
	void land() {
		System.out.println("plane landing");
	}
}
class cargo extends plane{
	@Override
	void fly() {
		System.out.println("cargoplane is flying");
	}
	
}
class fighter extends plane{
	@Override
	void fly() {
		System.out.println("fighter plane flying");
	}
}

public class runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        cargo c=new cargo();
        fighter f=new fighter();
        plane p=new plane();
        p.fly();
        c.fly();
        f.fly();
	}

}
