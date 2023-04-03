package OOPS;

public class b {

	int bike;
	
	
	
	b(int bike){
		this.bike=bike;
		
	}
	
	public void kk() {
		System.out.println(bike);
	}
	
	
	public static void main(String[] args) {
		b c=new b(25);
		c.kk();
	}
	
	
}
