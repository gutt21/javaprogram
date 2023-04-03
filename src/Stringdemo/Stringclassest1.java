package Stringdemo;

import java.util.Arrays;

public class Stringclassest1 {



	public static void main(String[] args) {


		String a="The best of both worlds";  	

		int count=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!=' ')
				count++;
		}
		System.out.println("total number of character:"+count);



		String b="akash,'guttedar',boy:";
		int counta=0;
		for(int i=0;i<b.length();i++){
			if(b.charAt(i)==':'||b.charAt(i)==',')
				counta++;
		}

		System.out.println("total number of Punctuations:"+counta);




		String c="akash guttedar boy";
		int vcountb=0;
		int ccountb=0;
		for(int i=0; i<c.length();i++) {
			if(c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o') {
				vcountb++;

			}
			else if(c.charAt(i)>='a'&&c.charAt(i)<='z') {
				ccountb++;
			}

		}
		System.out.println("Number of vowels: " + vcountb);    
		System.out.println("Number of consonants: " + ccountb);  



		String d="Grab";
		String e="BarG";
		d.toLowerCase();
		e.toLowerCase();
		char[] r= d.toCharArray();
		char[] s= e.toCharArray();
		Arrays.sort(r);
		Arrays.sort(s);		
		if(Arrays.equals(r, s)==true) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}



	}
}
