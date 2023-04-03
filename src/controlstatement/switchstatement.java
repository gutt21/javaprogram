package controlstatement;

public class switchstatement {

	
	public enum day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }
	
	public static void main(String[] args) {
		
		
		
		// with break
	String name="akash";
	
	switch(name) {
	
	case "asg":System.out.println("i am asg");
      break;
	case "khdar":
		System.out.println("i am khadar");
	break;
	                                                    //i am akash
	case "akash":
		System.out.println("i am akash");
	break;
		
		default:
			System.out.println("not any one ");
	}
	
		
	// without break
 /* String age="asg";
	
	switch(age) {
	
	 case "asg":
		System.out.println("i am asg");     
     case "khdar":
		System.out.println("i am khadar");              /* i am asg
		                                                 i am khadar
		                                                 i am akash
		                                                 not any one */
	/* case "akash":                                    
		System.out.println("i am akash");
	 default:
		System.out.println("not any one ");
	}*/
	
		
	
	// nested method
	
	String sk="ankita";
	String ak="akash";
	switch(ak) {
	case "nothing":System.out.println("nothin bro");
	      break;
	      
	case "akash":System.out.println("i am akash");
	  
	switch(sk) {
	
	case "anu":System.out.println("ia am anu");
	   break;
	 case "vaishu":System.out.println("i am vaishu");
	 break;
	 case "ankita":System.out.println("i am ankita");
	break;
	}
	break;
	  case "khadar":System.out.println("i am ");
	  switch(sk) {
	
	   case "anu":System.out.println("ia am anu");
	   break;
	  case "vaishu":System.out.println("i am vaishu");
	  break;
	  case "ankita":System.out.println("i am ankita");
	
	}
	
	break;
	}
	
	
	day[] daynow=day.values();
	 for(day now:daynow) {
		
		 switch (now)    
         {    
             case Sun:    
                 System.out.println("Sunday");    
                 break;    
             case Mon:    
                 System.out.println("Monday");    
                 break;    
             case Tue:    
                 System.out.println("Tuesday");    
                 break;         
             case Wed:    
                 System.out.println("Wednesday");    
                 break;    
             case Thu:    
                 System.out.println("Thursday");    
                 break;    
             case Fri:    
                 System.out.println("Friday");    
                 break;    
             case Sat:    
                 System.out.println("Saturday");    
                 break;    
         }    
     }    
		 
	}
	
	
	
	
	
	
	}

