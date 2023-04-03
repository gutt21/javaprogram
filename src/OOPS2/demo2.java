package OOPS2;

public class demo2 extends demo1 {

	
	String c="hell";
	int d=30;
	

	  
     public void test() {
    	 this.d=100;
		 System.out.println(d);
		String a="hello101";
		int b=101;
		System.out.println(a+" "+b);
	}
	
	
	
	public void test2() {
		test();
	//	super.test();
		System.out.println(c);
		System.out.println(d);
		System.out.println(super.c);
		
	}
	
	
	
	public static void main(String[] args) {
		demo2 b=new demo2();
		demo1 c=new demo2();
		b.test();
		b.test2();
		c.test();
		
	
	}
}
