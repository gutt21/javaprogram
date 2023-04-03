package OOPS;

public class banking  {


	int acc=1248554;
	String name="akash";
	int am=5000;
	
	
	
	public void akash(int acc,String name,int am) {
		this.acc=acc;
		this.name=name;
		this.am=am;
	}
	
	public void deposite(int a) {
		
		am=am+a;
		System.out.println(a+"-deposite");
	}
	 public void with(int b) {
		
		 if(am>=b) {
		 System.out.println(b+" -withdraw");
		    am=am-b;
		    System.out.println(am+"rem");
		 }else {
			 System.out.println("insufficient balance");
		 }
		 
	 }
	 
	 public void checkb() {
		 System.out.println( "my balance is "+am);
	 }
	 
	public void details() {
		System.out.println(acc+"-"+name+"-"+am);
	}
			 
		
	
	
	public static void main(String[] args) {
		banking b= new banking();
		b.deposite(5000);
		b.with(6000);
	}
			 
	 
}
